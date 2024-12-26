// Solution.java
package Calculator.impl;

import Calculator.ComplexNumber;

/**
 * Класс Solution реализует вывод решения для операций комплексных чисел.
 */
public class Solution {
    /**
     * Выводит решение для сложения комплексных чисел.
     *
     * @param num1   Первое комплексное число.
     * @param num2   Второе комплексное число.
     * @param result Результат сложения.
     */
    public static void printAdditionSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        printOperationSolution("Сложение", num1, num2, result);
    }

    /**
     * Выводит решение для вычитания комплексных чисел.
     *
     * @param num1   Уменьшаемое комплексное число.
     * @param num2   Вычитаемое комплексное число.
     * @param result Результат вычитания.
     */
    public static void printSubtractionSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        printOperationSolution("Вычитание", num1, num2, result);
    }

    /**
     * Выводит решение для умножения комплексных чисел.
     *
     * @param num1   Первое комплексное число.
     * @param num2   Второе комплексное число.
     * @param result Результат умножения.
     */
    public static void printMultiplicationSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        printOperationSolution("Умножение", num1, num2, result);
    }

    /**
     * Выводит решение для деления комплексных чисел.
     *
     * @param num1   Делимое комплексное число.
     * @param num2   Делитель комплексное число.
     * @param result Результат деления.
     */
    public static void printDivisionSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        printOperationSolution("Деление", num1, num2, result);
    }

    // Приватный метод для вывода общей части решения
    private static void printOperationSolution(String operation, ComplexNumber num1, ComplexNumber num2, ComplexNumber result) {
        System.out.println("Лог: Найти " + operation + " чисел " + num1 + " и " + num2 + ":");

        if (operation.equals("Сложение")) {
            System.out.println("Найдём отдельно суммы действительных частей и сумму мнимых частей: "
                    + "re = " + num1.getReal() + " + " + num2.getReal() + " = " + result.getReal() + ", "
                    + "im = " + num1.getImaginary() + " + " + num2.getImaginary() + " = " + result.getImaginary() + ".");
        } else if (operation.equals("Вычитание")) {
            System.out.println("Найдём отдельно разности действительных частей и разность мнимых частей: "
                    + "re = " + num1.getReal() + " - " + num2.getReal() + " = " + result.getReal() + ", "
                    + "im = " + num1.getImaginary() + " - " + num2.getImaginary() + " = " + result.getImaginary() + ".");
        } else if (operation.equals("Умножение")) {
            System.out.println("Найдём произведение с использованием формулы: "
                    + "re = " + num1.getReal() + " * " + num2.getReal() + " - " + num1.getImaginary() + " * "
                    + num2.getImaginary() + " = " + result.getReal() + ", "
                    + "im = " + num1.getReal() + " * " + num2.getImaginary() + " + " + num1.getImaginary() + " * "
                    + num2.getReal() + " = " + result.getImaginary() + ".");
        } else if (operation.equals("Деление")) {
            System.out.println("Найдём частное с использованием формулы: "
                    + "re = (" + num1.getReal() + " * " + num2.getReal() + " + " + num1.getImaginary() + " * "
                    + num2.getImaginary() + ") / (" + num2.getReal() + "^2 + " + num2.getImaginary() + "^2) = "
                    + result.getReal() + ", " + "im = (" + num1.getImaginary() + " * " + num2.getReal() + " - "
                    + num1.getReal() + " * " + num2.getImaginary() + ") / (" + num2.getReal() + "^2 + "
                    + num2.getImaginary() + "^2) = " + result.getImaginary() + ".");
        }

        System.out.println("Запишем их рядом, добавив к мнимой части i: " + result.getReal() + " + "
                + result.getImaginary() + "i");

        System.out.println("Полученное число и будет ответом: " + result);
        System.out.println();
    }
}
