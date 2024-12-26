package DependencyInversionPrinciple;

/**
 * Класс Car представляет собой автомобиль и зависит от интерфейса Engine.
 *
 * Принцип инверсии зависимостей (Dependency Inversion Principle, DIP) соблюдается в том, что:
 *
 * Класс Car зависит от абстракции (Engine интерфейс), а не от конкретных реализаций
 * (PetrolEngine и DieselEngine). Это видно в конструкторе Car, где в качестве параметра
 * принимается объект типа Engine.
 *
 * Создание объектов PetrolEngine и DieselEngine происходит вне класса Car. Таким образом, Car не
 * привязан к конкретным классам двигателей, и их создание может быть изменено или расширено без воздействия на Car.
 *
 * Применение интерфейса Engine позволяет добавлять новые типы двигателей, не изменяя код класса Car.
 */
public class Car {
    private Engine engine;
    /**
     * Конструктор класса Car, принимающий объект типа Engine в качестве зависимости.
     * @param engine Двигатель, который будет установлен в автомобиль.
     */
    public Car(Engine engine) {
        this.engine = engine;
    }
    /**
     * Метод start() вызывает метод start() у текущего двигателя автомобиля.
     */
    public void start() {
        this.engine.start();
    }
}
