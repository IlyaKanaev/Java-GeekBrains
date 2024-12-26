package InterfaceSegregationPrinciple;

/**
 * Класс Circle представляет круг и реализует интерфейс TwoDimensionalShape.
 */
public class Circle implements TwoDimensionalShape {
    private double radius; // Радиус круга

    /**
     * Конструктор класса Circle для создания объекта с указанным радиусом.
     *
     * @param radius Радиус круга.
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Реализация метода area() из интерфейса TwoDimensionalShape.
     * Вычисляет площадь круга по формуле.
     *
     * @return Площадь круга.
     */
    @Override
    public double area() {
        return 2 * 3.14 * radius; // Формула для площади круга
    }
}
