package Classes;

import java.util.ArrayList;
import java.util.List;

import Interfaces.iActorBehaviour;
import Interfaces.iMarketBehaviour;
import Interfaces.iQueueBehaviour;

/**
 * Класс, представляющий магазин с очередью покупателей.
 * Реализует интерфейсы iMarketBehaviour и iQueueBehaviour.
 */
public class Market implements iMarketBehaviour, iQueueBehaviour {

    /** Очередь покупателей в магазине. */
    private List<iActorBehaviour> queue;

    /**
     * Конструктор для создания объекта магазина с пустой очередью.
     */
    public Market() {
        this.queue = new ArrayList<iActorBehaviour>();
    }

    /**
     * Метод для принятия покупателя в магазин.
     * @param actor Покупатель, который пришел в магазин.
     */
    @Override
    public void acceptToMarket(iActorBehaviour actor) {
        System.out.println(actor.geActor().getName() + " покупатель пришел в магазин ");
        takeInQueue(actor);
    }

    /**
     * Метод для добавления покупателя в очередь.
     * @param actor Покупатель для добавления в очередь.
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {
        this.queue.add(actor);
        System.out.println(actor.geActor().getName() + " покупатель добавлен в очередь ");
    }

    /**
     * Метод для освобождения магазина от покупателей.
     * @param actors Список покупателей, которые уходят из магазина.
     */
    @Override
    public void releseFromMarket(List<Actor> actors) {
        for (Actor actor : actors) {
            System.out.println(actor.getName() + " покупатель ушел из магазина ");
            queue.remove(actor);
        }
    }

    /**
     * Метод для обновления состояния магазина.
     * Вызывает методы takeOrder(), giveOrder(), releaseFromQueue().
     */
    @Override
    public void update() {
        takeOrder();
        giveOrder();
        releaseFromQueue();
    }

    /**
     * Метод для выдачи заказов покупателям.
     */
    @Override
    public void giveOrder() {
        for (iActorBehaviour actor : queue) {
            if (actor.isMakeOrder()) {
                actor.setTakeOrder(true);
                System.out.println(actor.geActor().getName() + " покупатель получил свой заказ ");
            }
        }
    }

    /**
     * Метод для выхода покупателей из очереди.
     */
    @Override
    public void releaseFromQueue() {
        List<Actor> releaseActors = new ArrayList<>();
        for (iActorBehaviour actor : queue) {
            if (actor.isTakeOrder()) {
                releaseActors.add(actor.geActor());
                System.out.println(actor.geActor().getName() + " покупатель ушел из очереди ");
            }
        }
        releseFromMarket(releaseActors);
    }

    /**
     * Метод для завершения заказа покупателя.
     */
    @Override
    public void takeOrder() {
        for (iActorBehaviour actor : queue) {
            if (!actor.isMakeOrder()) {
                actor.setMakeOrder(true);
                System.out.println(actor.geActor().getName() + " покупатель сделал заказ ");
            }
        }
    }
}
