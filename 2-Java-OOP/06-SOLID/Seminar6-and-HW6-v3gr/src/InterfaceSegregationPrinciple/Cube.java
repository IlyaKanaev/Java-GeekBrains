package InterfaceSegregationPrinciple;

/**
 * Класс Cube представляет куб и реализует интерфейсы TwoDimensionalShape и ThreeDimensionalShape.
 */
public class Cube implements TwoDimensionalShape, ThreeDimensionalShape {
    private int edge; // Ребро куба

    /**
     * Конструктор класса Cube для создания объекта с указанным ребром.
     * @param edge Ребро куба.
     */
    public Cube(int edge) {
        this.edge = edge;
    }

    /**
     * Реализация метода area() из интерфейса TwoDimensionalShape.
     * Вычисляет площадь поверхности куба по формуле.
     * @return Площадь поверхности куба.
     */
    @Override
    public double area() {
        return 6 * edge * edge; // Формула для площади поверхности куба
    }

    /**
     * Реализация метода volume() из интерфейса ThreeDimensionalShape.
     * Вычисляет объем куба по формуле.
     * @return Объем куба.
     */
    @Override
    public double volume() {
        return edge * edge * edge; // Формула для объема куба
    }
}
