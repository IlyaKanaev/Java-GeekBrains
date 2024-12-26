import Classes.*;
import Interfaces.iActorBehaviour;
import Interfaces.iReturnOrder;

/**
 * Главный класс приложения, демонстрирующий работу магазина и покупателей.
 */
public class App {
    public static void main(String[] args) throws Exception {
        // Создаем объект магазина с именем "magnit".
        Market magnit = new Market();

        // Создаем обычных покупателей (Actors) с именами "boris" и "masha".
        Actor client1 = new OrdinaryClient("boris");
        Actor client2 = new OrdinaryClient("masha");

        // Создаем специального покупателя с именем "prezident" и идентификатором 1.
        Actor client3 = new SpecialClient("prezident", 1);

        // Создаем тайного покупателя
        iActorBehaviour client4 = new TaxInspector();

        // Создаем акционного клиента с именем "ivan", участвующего в акции "SummerSale" с id 123.
        Actor client5 = new PromotionalClient("ivan", "SummerSale", 123);

        // Вход клиентов в магазин, вызывая метод acceptToMarket у объекта magnit.
        magnit.acceptToMarket(client1);
        magnit.acceptToMarket(client2);
        magnit.acceptToMarket(client3);
        magnit.acceptToMarket(client4);
        magnit.acceptToMarket(client5);

        // Обновляем состояние магазина, вызывая метод update у объекта magnit.
        magnit.update();

        // Симулируем возврат товара для client1
        if (client1 instanceof iReturnOrder) {
            iReturnOrder returnableClient = (iReturnOrder) client1;
            returnableClient.returnOrder();
        }

        // Снова обновляем состояние магазина после возврата товара
        magnit.update();
    }
}

