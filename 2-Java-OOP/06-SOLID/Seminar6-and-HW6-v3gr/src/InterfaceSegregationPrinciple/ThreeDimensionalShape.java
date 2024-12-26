package InterfaceSegregationPrinciple;

/**
 * Интерфейс ThreeDimensionalShape представляет собой интерфейс для трехмерных фигур.
 * Содержит единственный метод volume(), предназначенный для расчета объема фигуры.
 */
public interface ThreeDimensionalShape {

    /**
     * Метод для расчета объема фигуры.
     * @return Объем фигуры.
     */
    double volume();
}
