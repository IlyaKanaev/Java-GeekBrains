// ComplexCalculator.java
package Calculator;

import Calculator.exception.CalculatorException;

/**
 * Интерфейс для калькулятора комплексных чисел.
 */
public interface ComplexCalculator {
    ComplexNumber add(ComplexNumber a, ComplexNumber b);
    ComplexNumber subtract(ComplexNumber a, ComplexNumber b);
    ComplexNumber multiply(ComplexNumber a, ComplexNumber b);
    ComplexNumber divide(ComplexNumber a, ComplexNumber b) throws CalculatorException;
}
