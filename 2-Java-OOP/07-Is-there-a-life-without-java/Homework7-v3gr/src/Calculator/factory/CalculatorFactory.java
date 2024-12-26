// Calculator/factory/CalculatorFactory.java
package Calculator.factory;

import Calculator.ComplexCalculator;
import Logger.Logger;
import Calculator.impl.BasicComplexCalculator;

/**
 * Фабрика для создания экземпляров ComplexCalculator.
 */
public class CalculatorFactory {
    /**
     * Метод для создания экземпляра ComplexCalculator с заданным логгером.
     *
     * @param logger Логгер для записи операций и результатов.
     * @return Экземпляр ComplexCalculator.
     */
    public ComplexCalculator createComplexCalculator(Logger logger) {
        // Возвращаем экземпляр ComplexCalculator с заданным логгером
        return new BasicComplexCalculator(logger);
    }

    // Другие методы, если необходимо
}
