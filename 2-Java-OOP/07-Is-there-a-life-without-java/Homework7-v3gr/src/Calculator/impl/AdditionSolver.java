// Calculator/impl/AdditionSolver.java
package Calculator.impl;

import Calculator.ComplexNumber;

/**
 * Класс AdditionSolver реализует вывод решения для операции сложения комплексных чисел.
 */
public class AdditionSolver extends OperationSolver {
    @Override
    public void printSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        Solution.printAdditionSolution(num1, num2, result);
    }
}