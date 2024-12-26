package LiskovSubstitutionPrinciple;

/**
 * Класс Square представляет собой квадрат и является подклассом класса Shape.
 */
public class Square extends Shape {

    /**
     * Переопределенный метод для установки ширины и высоты квадрата.
     * Так как квадрат имеет одинаковые стороны, устанавливаем их значения одинаковыми.
     * @param width Новое значение ширины (стороны) квадрата.
     */
    @Override
    public void setWidth(int width) {
        super.width = width;
        super.height = width;
    }

    /**
     * Переопределенный метод для установки ширины и высоты квадрата.
     * Так как квадрат имеет одинаковые стороны, устанавливаем их значения одинаковыми.
     * @param height Новое значение высоты (стороны) квадрата.
     */
    @Override
    public void setHeight(int height) {
        super.width = height;
        super.height = height;
    }
}
