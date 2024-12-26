package Interfaces;

import Classes.Actor;

/**
 * Интерфейс, определяющий поведение покупателя в магазине.
 */
public interface iActorBehaviour {

    /**
     * Проверяет, принимает ли покупатель заказ.
     * @return true, если покупатель принимает заказ, иначе false.
     */
    public boolean isTakeOrder();

    /**
     * Проверяет, делает ли покупатель заказ.
     * @return true, если покупатель делает заказ, иначе false.
     */
    public boolean isMakeOrder();

    /**
     * Устанавливает состояние принятия заказа для покупателя.
     * @param val Значение, устанавливаемое для состояния принятия заказа.
     */
    public void setTakeOrder(boolean val);

    /**
     * Устанавливает состояние создания заказа для покупателя.
     * @param val Значение, устанавливаемое для состояния создания заказа.
     */
    public void setMakeOrder(boolean val);

    /**
     * Возвращает объект покупателя.
     * @return Объект покупателя.
     */
    public Actor geActor();
}
