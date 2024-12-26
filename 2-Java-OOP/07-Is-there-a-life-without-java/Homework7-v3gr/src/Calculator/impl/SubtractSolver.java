// Calculator/impl/SubtractSolver.java
package Calculator.impl;

import Calculator.ComplexNumber;

/**
 * Класс SubtractSolver реализует вывод решения для операции вычитания комплексных чисел.
 */
public class SubtractSolver extends OperationSolver {
    @Override
    public void printSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        Solution.printSubtractionSolution(num1, num2, result);
    }
}
