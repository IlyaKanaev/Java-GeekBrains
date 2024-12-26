// Main.java
package App;

import Calculator.ComplexCalculator;
import Calculator.ComplexNumber;
import Calculator.exception.CalculatorException;
import Calculator.factory.CalculatorFactory;
import Calculator.impl.*;
import Logger.Logger;
import Logger.impl.ConsoleLogger;

/**
 * Класс Main демонстрирует использование калькулятора комплексных чисел.
 * Создает экземпляры комплексных чисел, выполняет различные операции (сложение, вычитание, умножение, деление)
 * с использованием комплексного калькулятора и выводит результаты операций и их решения в лог.
 */
public class Main {

    public static void main(String[] args) {
        // Используем фабрику (паттерны) для создания калькулятора с консольным логгером
        Logger consoleLogger = new ConsoleLogger();
        CalculatorFactory calculatorFactory = new CalculatorFactory();
        ComplexCalculator calculator = calculatorFactory.createComplexCalculator(consoleLogger);

        try {
            // Создаем комплексные числа. Первое число действительная часть, второе мнимая.
            ComplexNumber num1 = new ComplexNumber(1, 3);
            ComplexNumber num2 = new ComplexNumber(1, 2);

            // Выполняем операции

            ComplexNumber sumResult = calculator.add(num1, num2); // сумма чисел
            ComplexNumber subtractResult = calculator.subtract(num1, num2); // разность чисел
            ComplexNumber multiplyResult = calculator.multiply(num1, num2); // умножение чисел

            // Из за возможного деления на ноль, проверяем результат деления
            ComplexNumber divideResult;
            ComplexNumber division = calculator.divide(num1, num2);
            if (division != null) {
                divideResult = division;
            } else {
                divideResult = new ComplexNumber(0, 0); // или другое значение по умолчанию
            }

            System.out.println(); // перевод каретки на новую строку

            /**
             * Изначально планировалось просто выводить результат в консоль, но для усложнения задачи,
             * было принято решение сделать дополнительные классы и интерфесы, чтобы кратко расписывалось решение
             * задания
             */

            // Создаем экземпляры Solution для каждой операции
            Solution sumSolution = new Solution();
            Solution subtractSolution = new Solution();
            Solution multiplySolution = new Solution();
            Solution divideSolution = new Solution();

            // Выводим решения
            sumSolution.printAdditionSolution(num1, num2, sumResult);
            subtractSolution.printSubtractionSolution(num1, num2, subtractResult);
            multiplySolution.printMultiplicationSolution(num1, num2, multiplyResult);
            divideSolution.printDivisionSolution(num1, num2, divideResult);

        } catch (CalculatorException e) {
            e.printStackTrace();  // Обработка исключений
        }
    }
}