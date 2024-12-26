// Calculator/impl/OperationSolver.java
package Calculator.impl;

import Calculator.ComplexNumber;

/**
 * Абстрактный класс OperationSolver предоставляет метод для вывода решения операции.
 */
public abstract class OperationSolver {
    /**
     * Выводит решение для операции с комплексными числами.
     */
    public abstract void printSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result);
}
