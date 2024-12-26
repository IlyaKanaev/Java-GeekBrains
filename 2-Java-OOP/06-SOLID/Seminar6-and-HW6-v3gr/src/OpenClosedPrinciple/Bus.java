package OpenClosedPrinciple;

/**
 * Класс Bus представляет собой тип транспортного средства - автобус.
 * Унаследован от абстрактного класса Vehicle.
 */
public class Bus extends Vehicle {

    /**
     * Конструктор класса Bus для создания объекта с указанной максимальной скоростью.
     *
     * @param maxSpeed Максимальная скорость автобуса.
     */
    public Bus(int maxSpeed) {
        // Вызываем конструктор базового класса Vehicle с указанием типа "Bus"
        super(maxSpeed, "Bus");
    }

    /**
     * Переопределенный метод для расчета разрешенной скорости для автобуса.
     * В данном случае, возвращает 60% от максимальной скорости.
     *
     * @return Разрешенная скорость для автобуса.
     */
    @Override
    public double calculateAllowedSpeed() {
        return maxSpeed * 0.6;
    }
}
