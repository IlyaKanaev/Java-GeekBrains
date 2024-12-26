package Calculator;

import java.util.Objects;

/**
 * Класс ComplexNumber представляет комплексное число и
 * определяет базовые арифметические операции для комплексных чисел.
 */
public class ComplexNumber {
    private double real;         // Реальная часть комплексного числа
    private double imaginary;    // Мнимая часть комплексного числа

    /**
     * Конструктор ComplexNumber.
     *
     * @param real      Реальная часть комплексного числа.
     * @param imaginary Мнимая часть комплексного числа.
     */
    public ComplexNumber(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    /**
     * Получить реальную часть комплексного числа.
     *
     * @return Реальная часть.
     */
    public double getReal() {
        return real;
    }

    /**
     * Получить мнимую часть комплексного числа.
     *
     * @return Мнимая часть.
     */
    public double getImaginary() {
        return imaginary;
    }

    /**
     * Переопределение метода toString для корректного отображения значения комплексного числа.
     *
     * @return Строковое представление комплексного числа.
     */
    @Override
    public String toString() {
        return real + (imaginary < 0 ? " - " : " + ") + Math.abs(imaginary) + "i";
    }

    /**
     * Переопределение метода equals для сравнения комплексных чисел.
     *
     * @param o Объект для сравнения.
     * @return true, если объекты равны, иначе false.
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ComplexNumber that = (ComplexNumber) o;
        return Double.compare(that.real, real) == 0 &&
                Double.compare(that.imaginary, imaginary) == 0;
    }

    /**
     * Переопределение метода hashCode для вычисления хэш-кода комплексного числа.
     *
     * @return Хэш-код комплексного числа.
     */
    @Override
    public int hashCode() {
        return Objects.hash(real, imaginary);
    }
}
