package Classes;

/**
 * Класс представляющий акционного покупателя.
 * Расширяет базовый класс обычного покупателя OrdinaryClient.
 */
public class PromotionalClient extends OrdinaryClient {

    // Добавляем дополнительные поля
    private String stockName; // Название акции
    private int clientId; // ID покупателя
    private static int numberOfParticipants; // Поле статическое для хранения общего количества участников в акции.

    /**
     * Конструктор для создания акционного покупателя.
     * @param name Имя покупателя.
     * @param stockName Название акции.
     * @param clientId ID покупателя.
     */
    public PromotionalClient(String name, String stockName, int clientId) {
        super(name);
        this.stockName = stockName;
        this.clientId = clientId;
        // Увеличиваем общее количество участников в акции при создании нового акционного покупателя.
        numberOfParticipants++;
    }

    /**
     * Получить название акции.
     * @return Название акции.
     */
    public String getStockName() {
        return stockName;
    }

    /**
     * Установить название акции.
     * @param stockName Название акции.
     */
    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    /**
     * Получить ID покупателя.
     * @return ID покупателя.
     */
    public int getClientId() {
        return clientId;
    }


    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    // Геттер для статического поля numberOfParticipants
    public static int getNumberOfParticipants() {
        return numberOfParticipants;
    }
}
