package Classes;

import Interfaces.iActorBehaviour;

/**
 * Абстрактный класс, представляющий покупателя.
 * Реализует интерфейс iActorBehaviour.
 */
public abstract class Actor implements iActorBehaviour {
    /**
     * Имя покупателя.
     */
    protected String name;

    /**
     * Флаги, указывающие, делает ли покупатель заказ.
     */
    protected boolean isTakeOrder;
    protected boolean isMakeOrder;

    /**
     * Конструктор для создания покупателя.
     * @param name Имя покупателя.
     */
    public Actor(String name) {
        this.name = name;
    }

    /**
     * Абстрактный метод для получения имени покупателя.
     * @return Имя покупателя.
     */
    public abstract String getName();

    /**
     * Абстрактный метод для установки имени покупателя.
     * @param name Новое имя покупателя.
     */
    public abstract void setName(String name);
}

