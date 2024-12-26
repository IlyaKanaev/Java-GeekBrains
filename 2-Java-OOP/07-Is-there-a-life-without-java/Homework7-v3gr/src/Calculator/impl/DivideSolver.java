// Calculator/impl/DivideSolver.java
package Calculator.impl;

import Calculator.ComplexNumber;

/**
 * Класс DivideSolver реализует вывод решения для операции деления комплексных чисел.
 */
public class DivideSolver extends OperationSolver {
    @Override
    public void printSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        Solution.printDivisionSolution(num1, num2, result);
    }
}