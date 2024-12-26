// BasicComplexCalculator.java
package Calculator.impl;

import Calculator.ComplexCalculator;
import Calculator.ComplexNumber;
import Calculator.exception.CalculatorException;
import Logger.Logger;

/**
 * Класс BasicComplexCalculator реализует интерфейс ComplexCalculator
 * и предоставляет базовые арифметические операции для комплексных чисел.
 */
public class BasicComplexCalculator implements ComplexCalculator {
    private Logger logger;  // Логгер для записи операций и результатов

    /**
     * Конструктор BasicComplexCalculator.
     *
     * @param logger Логгер для записи операций и результатов.
     */
    public BasicComplexCalculator(Logger logger) {
        this.logger = logger;
    }

    /**
     * Выполняет сложение двух комплексных чисел.
     *
     * @param a Первое комплексное число.
     * @param b Второе комплексное число.
     * @return Результат сложения.
     */
    @Override
    public ComplexNumber add(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber(a.getReal() + b.getReal(), a.getImaginary() + b.getImaginary());
        logOperation("Сложение", a, b, result);
        return result;
    }

    /**
     * Выполняет вычитание двух комплексных чисел.
     *
     * @param a Уменьшаемое комплексное число.
     * @param b Вычитаемое комплексное число.
     * @return Результат вычитания.
     */
    @Override
    public ComplexNumber subtract(ComplexNumber a, ComplexNumber b) {
        ComplexNumber result = new ComplexNumber(a.getReal() - b.getReal(), a.getImaginary() - b.getImaginary());
        logOperation("Вычитание", a, b, result);
        return result;
    }

    /**
     * Выполняет умножение двух комплексных чисел.
     *
     * @param a Первое комплексное число.
     * @param b Второе комплексное число.
     * @return Результат умножения.
     */
    @Override
    public ComplexNumber multiply(ComplexNumber a, ComplexNumber b) {
        double realPart = a.getReal() * b.getReal() - a.getImaginary() * b.getImaginary();
        double imaginaryPart = a.getReal() * b.getImaginary() + a.getImaginary() * b.getReal();

        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logOperation("Умножение", a, b, result);
        return result;
    }

    /**
     * Выполняет деление двух комплексных чисел.
     *
     * @param a Делимое комплексное число.
     * @param b Делитель комплексное число.
     * @return Результат деления в виде Optional<ComplexNumber>.
     * @throws CalculatorException если делитель равен нулю.
     */
    @Override
    public ComplexNumber divide(ComplexNumber a, ComplexNumber b) throws CalculatorException {
        double divisor = b.getReal() * b.getReal() + b.getImaginary() * b.getImaginary();

        if (divisor == 0) {
            throw new CalculatorException("Деление на ноль невозможно");
        }

        double realPart = (a.getReal() * b.getReal() + a.getImaginary() * b.getImaginary()) / divisor;
        double imaginaryPart = (a.getImaginary() * b.getReal() - a.getReal() * b.getImaginary()) / divisor;

        ComplexNumber result = new ComplexNumber(realPart, imaginaryPart);
        logOperation("Деление", a, b, result);
        return result;
    }

    // Приватный метод для логгирования операции и результата
    private void logOperation(String operation, ComplexNumber a, ComplexNumber b, ComplexNumber result) {
        String logMessage = String.format("%s: %s и %s = %s", operation, a, b, result);
        logger.log(logMessage);
    }
}
