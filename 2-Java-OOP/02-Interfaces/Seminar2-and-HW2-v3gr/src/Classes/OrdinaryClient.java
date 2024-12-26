package Classes;

import Interfaces.iReturnOrder;
// Класс обычного покупателя (клиента)
public class OrdinaryClient extends Actor implements iReturnOrder {

    // Конструктор класса
    public OrdinaryClient(String name) {
        super(name);
    }

    // Методы для управления заказами клиента

    /**
     * Проверяет, совершает ли клиент заказ.
     * @return true, если клиент совершает заказ, иначе false.
     */
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Устанавливает флаг совершением заказа клиентом.
     * @param val true, если совершает заказ, false - в противном случае.
     */
    public void setTakeOrder(boolean val) {
        super.isTakeOrder = val;
    }

    public void setMakeOrder(boolean val) {
        super.isMakeOrder = val;
    }

    // Методы для работы с покупателями

    /**
     * Возвращает объект покупателя.
     * @return Объект покупателя.
     */
    public Actor geActor() {
        return this;
    }

    // Методы для работы с именем покупателя

    /**
     * Получает имя покупателя.
     * @return Имя покупателя.
     */
    public String getName() {
        return super.name;
    }

    /**
     * Устанавливает новое имя для покупателя.
     * @param name Новое имя покупателя.
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    // Реализация интерфейса iReturnOrder

    /**
     * Реализация метода возврата товара для обычного покупателя.
     */
    @Override
    public void returnOrder() {
        System.out.println("Обычный покупатель " + getName() + " возвращает заказ");
        // Логика возврата товара для обычного клиента
    }

    /**
     * Реализация метода для получения информации о возвращенных товарах для обычного покупателя.
     */
    @Override
    public void getReturnInfo() {
        System.out.println("Получение информации о возвращенных товарах для обычного покупателя " + getName() + ".");
        // Логика получения информации о возвращенных товарах для обычного покупателя
    }
}
