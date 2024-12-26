Комплексный Калькулятор
Обзор
Комплексный Калькулятор - это приложение на Java, предоставляющее базовые арифметические операции для комплексных чисел. Он включает в себя интерфейс ComplexCalculator, различные реализации арифметических операций и класс Solution для вывода решений каждой операции.

Архитектура
ComplexCalculator (Интерфейс)
Определяет базовые арифметические операции для комплексных чисел.
Включает методы для сложения, вычитания, умножения и деления.
CalculatorFactory
Фабричный класс, ответственный за создание экземпляров ComplexCalculator с указанным логгером.
ConsoleLogger
Реализация интерфейса Logger, который логгирует сообщения в консоль.
OperationSolver (Абстрактный Класс)
Абстрактный класс, предоставляющий метод для вывода решений для операций с комплексными числами.
Подклассы (AdditionSolver, SubtractSolver, MultiplySolver, DivideSolver) реализуют метод printSolution для конкретных операций.
Solution
Класс, ответственный за вывод решений для операций с комплексными числами.
Включает методы для вывода решений для сложения, вычитания, умножения и деления.
Main
Основной класс, демонстрирующий использование Комплексного Калькулятора.
Создает экземпляры комплексных чисел, выполняет различные операции с использованием калькулятора, логгирует результаты и решения.
Методы
Интерфейс ComplexCalculator
ComplexNumber add(ComplexNumber num1, ComplexNumber num2): Выполняет сложение двух комплексных чисел.
ComplexNumber subtract(ComplexNumber num1, ComplexNumber num2): Выполняет вычитание двух комплексных чисел.
ComplexNumber multiply(ComplexNumber num1, ComplexNumber num2): Выполняет умножение двух комплексных чисел.
Optional<ComplexNumber> divide(ComplexNumber num1, ComplexNumber num2): Выполняет деление двух комплексных чисел. Возвращает Optional.
Абстрактный Класс OperationSolver
abstract void printSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result): Абстрактный метод для вывода решения для конкретной операции.
Класс Solution
void printAdditionSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result): Выводит решение для сложения.
void printSubtractionSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result): Выводит решение для вычитания.
void printMultiplicationSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result): Выводит решение для умножения.
void printDivisionSolution(ComplexNumber num1, ComplexNumber num2, ComplexNumber result): Выводит решение для деления.
Использование
Создайте экземпляры ComplexCalculator с помощью CalculatorFactory.
Используйте калькулятор для выполнения арифметических операций с комплексными числами.
Выводите результаты и решения с использованием класса Solution.