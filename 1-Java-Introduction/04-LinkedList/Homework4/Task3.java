/*В обычный калькулятор без логирования добавьте возможность отменить последнюю операцию.
Отмена последней операции должна быть реализована следующим образом: если передан оператор '<' калькулятор должен вывести результат предпоследней операции.
calculate('+', 3, 7)
calculate('+', 4, 7)
calculate('<', 0, 0)
// 10.0
// 11.0
// 10.0
calculate('*', 3, 2)
calculate('-', 7, 4)
calculate('<', 0, 0)
// 6.0
// 3.0
// 6.0 
 */
class Calculator {
    double previousResult = 0;
    double temp = 0;
    public double calculate(char op, int a, int b) {
        // Напишите свое решение ниже
        double result = 0;
        switch (op) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            case '<':
                result = previousResult;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                return result;
        }
        previousResult = temp;
        temp = result;
        return result;
    }
}


// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task3 {
    public static void main(String[] args) {
        int a, b, c, d;
        char op, op2, undo;

        if (args.length == 0) {
            // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = 3;
            op = '*';
            b = 2;
            c = 7;
            op2 = '-';
            d = 4;
            undo = '<';
        } else {
            a = Integer.parseInt(args[0]);
            op = args[1].charAt(0);
            b = Integer.parseInt(args[2]);
            c = Integer.parseInt(args[3]);
            op2 = args[4].charAt(0);
            d = Integer.parseInt(args[5]);
            undo = args[6].charAt(0);
        }

        Calculator calculator = new Calculator();
        double result = calculator.calculate(op, a, b);
        System.out.println(result);
        double result2 = calculator.calculate(op2, c, d);
        System.out.println(result2);
        double prevResult = calculator.calculate(undo, 0, 0);
        System.out.println(prevResult);
    }
}
