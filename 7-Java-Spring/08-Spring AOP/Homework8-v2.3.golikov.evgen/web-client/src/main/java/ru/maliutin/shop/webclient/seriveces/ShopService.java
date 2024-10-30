package ru.maliutin.shop.webclient.seriveces;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;
import ru.maliutin.shop.webclient.acpect.LogLeadTime;
import ru.maliutin.shop.webclient.models.Order;
import ru.maliutin.shop.webclient.models.Product;
import ru.maliutin.shop.webclient.models.Transaction;
import ru.maliutin.shop.webclient.models.api.ApiBasicUri;

import java.math.BigDecimal;
import java.security.Principal;
import java.util.List;

/**
 * Сервис для осуществления покупки.
 */
@Service
public class ShopService {
    /**+
     * Api оплаты.
     */
    private final ApiBasicUri apiBasicUri;
    /**
     * Номер счета магазина.
     */
    private final String shopAccount;

    private final OAuth2AuthorizedClientService authorizedClientService;


    public ShopService(ApiBasicUri apiBasicUri,
                       @Value("${shop.account.number}") String shopAccount,
                       OAuth2AuthorizedClientService authorizedClientService) {
        this.apiBasicUri = apiBasicUri;
        this.shopAccount = shopAccount;
        this.authorizedClientService = authorizedClientService;
    }

    /**
     * Получение все товаров со склада.
     * @return список товаров.
     */
    @LogLeadTime
    public List<Product> getAll(Principal principal){
        RestTemplate template = new RestTemplate();
        HttpEntity<Object> entity = new HttpEntity<>(getAccessToken(principal));
        ResponseEntity<List<Product>> response = template.exchange(apiBasicUri.getStorageUri(),
        HttpMethod.GET, entity, new ParameterizedTypeReference<>(){});
        return response.getBody();
    }

    /**
     * Метод покупки товара. На каждом этапе происходит проверка,
     * в случае получения исключения происходит откат выполненных транзакций.
     * @param productId идентификатор продукта.
     * @param amount количество заказанного продукта.
     * @param sum сумма заказа.
     * @param numberCredit номер счета для списания.
     */
    @LogLeadTime
    public void buyProduct(Long productId, int amount,
                           BigDecimal sum, Long numberCredit, Principal principal){
        productReserve(productId, amount, principal);
        try {
            payOrder(sum, numberCredit, principal);
            try{
                productBay(productId, amount, principal);
            } catch (HttpClientErrorException e){
                rollbackPayOrder(sum, numberCredit, principal);
                rollbackProductReserve(productId, amount, principal);
                throw e;
            }
        }catch (HttpClientErrorException e){
            rollbackProductReserve(productId, amount, principal);
            throw e;
        }
    }

    /**
     * Резервирование продукта на складе.
     * @param id идентификатор продукта.
     * @param amount количество.
     */
    @LogLeadTime
    private void productReserve(Long id, int amount, Principal principal)
            throws HttpClientErrorException {
        RestTemplate template = new RestTemplate();
        String path = apiBasicUri.getStorageUri() + id + "/reserve";
        Order order = new Order();
        order.setAmount(amount);
        HttpEntity<Object> entity = new HttpEntity<>(order, getAccessToken(principal));
        template.postForEntity(path, entity, Object.class);
    }

    /**
     * Служебный метод отката резервирования товара
     * @param id идентификатор товара.
     * @param amount количество.
     */
    @LogLeadTime
    private void rollbackProductReserve(Long id, int amount, Principal principal)
            throws HttpClientErrorException {
        RestTemplate template = new RestTemplate();
        String path = apiBasicUri.getStorageUri() + id + "/reserve/rollback";
        Order order = new Order();
        order.setAmount(amount);
        HttpEntity<Object> entity = new HttpEntity<>(order, getAccessToken(principal));
        template.postForEntity(path, entity, Object.class);
    }

    /**
     * Оформление покупки, уменьшение остатка на складе.
     * @param id идентификатор продукта.
     * @param amount количество товара.
     */
    @LogLeadTime
    private void productBay(Long id, int amount, Principal principal)
            throws HttpClientErrorException {
        RestTemplate template = new RestTemplate();
        Order order = new Order();
        order.setAmount(amount);
        HttpEntity<Object> entity = new HttpEntity<>(order, getAccessToken(principal));
        template.postForEntity(apiBasicUri.getStorageUri() + id,
                entity, Object.class);
    }

    /**
     * Оплата товара
     * @param sum сумма для оплаты.
     * @param numberCredit номер счета списания.
     */
    @LogLeadTime
    private void payOrder(BigDecimal sum, Long numberCredit, Principal principal)
            throws HttpClientErrorException {
        RestTemplate template = new RestTemplate();
        Transaction transaction = new Transaction();
        transaction.setCreditNumber(numberCredit);
        transaction.setDebitNumber(Long.parseLong(shopAccount));
        transaction.setSum(sum);
        HttpEntity<Object> entity = new HttpEntity<>(transaction, getAccessToken(principal));
        template.postForEntity(apiBasicUri.getPaymentUri(),
                entity, Object.class);
    }

    /**
     * Служебный метод отката произведенной оплаты.
     * @param sum сумма операции.
     * @param numberCredit номер счета.
     */
    @LogLeadTime
    private void rollbackPayOrder(BigDecimal sum, Long numberCredit, Principal principal)
            throws HttpClientErrorException {
        RestTemplate template = new RestTemplate();
        Transaction transaction = new Transaction();
        transaction.setCreditNumber(numberCredit);
        transaction.setDebitNumber(Long.parseLong(shopAccount));
        transaction.setSum(sum);
        HttpEntity<Object> entity = new HttpEntity<>(transaction, getAccessToken(principal));
        template.postForEntity(apiBasicUri.getPaymentUri() + "/rollback",
                entity, Object.class);
    }

    private HttpHeaders getAccessToken(Principal principal){
        // Получение access токена
        String accessToken = authorizedClientService
                .loadAuthorizedClient("reg-client", principal.getName())
                .getAccessToken().getTokenValue();
        // Создаем заголовок и помещаем в него токен авторизации
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.set("Authorization", "Bearer " + accessToken);

        return httpHeaders;
    }
}
