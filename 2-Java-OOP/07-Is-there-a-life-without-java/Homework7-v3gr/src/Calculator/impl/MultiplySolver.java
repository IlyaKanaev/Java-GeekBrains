// Calculator/impl/MultiplySolver.java
package Calculator.impl;

import Calculator.ComplexNumber;

/**
 * Класс MultiplySolver реализует вывод решения для операции умножения комплексных чисел.
 */
public class MultiplySolver extends OperationSolver {
    @Override
    public void printSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        Solution.printMultiplicationSolution(num1, num2, result);
    }
}
