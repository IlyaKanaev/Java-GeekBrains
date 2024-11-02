package Homework1;
/*Реализовать простой калькулятор

В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".

// Аргументы, передаваемые в метод/функцию:
'3'
'+'
'7'
// На выходе:
10.0
 * 
 */
class Calculator {
    public double calculate(char op, int a, int b) {
      // Введите свое решение ниже
        double result = 0.0;
        switch (op) {
            case '+': return (double) a + b;
            case '-': return (double) a - b;
            case '*': return (double) a * b;
            case '/': return (double) a / b;
            default: System.out.printf("Некорректный оператор: %c", op);
                break;
        }
        return result;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3{ 
    public static void main(String[] args) { 
        int a = 0;
        char op = ' ';
        int b = 0;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '+';
            b = 7;
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
    }
}

// Variant 2
// class Calculator {
//     public double calculate(char op, int a, int b) {
//         // Введите свое решение ниже
//         double result = 0;
//         switch (op) {
//             case '+':
//                 result = add(a, b);
//                 break;
//             case '-':
//                 result = minus(a, b);
//                 break;
//             case '*':
//                 result = mult(a, b);
//                 break;
//             case '/':
//                 result = divide(a, b);
//                 break;
//         }
//         return result;
//     }

//     private double divide(int a, int b) {
//         if (b != 0)
//             return (double) a / b;
//         return -1;
//     }

//     private int mult(int a, int b) {
//         return a * b;
//     }

//     private int minus(int a, int b) {
//         return a - b;
//     }

//     private int add(int a, int b) {
//         return a + b;
//     }
// }
