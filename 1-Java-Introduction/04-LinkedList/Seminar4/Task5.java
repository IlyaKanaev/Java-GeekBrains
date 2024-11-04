/*Реализовать алгоритм перевода из инфиксной записи в постфиксную для арифметического выражения. 
 */
import java.util.*;

public class Task5 {

    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();    // Выходные данные будут представлены в виде постфикса
        Stack<Character> stk = new Stack<>();           // Инициализируем стек для хранения операторов
        for (char c : infix.toCharArray()) {
                // если встреченный символ является операндом добавляем его в выходные данные, т.е. постфикс
            if (Character.isLetterOrDigit(c)) {
                postfix.append(c);
                // если встреченный символ равен '(', помещаем его в стек(stk)
            }
            else if (c == '(') {
                stk.push(c);
                // если встреченный символ равен ')', извлекаем стек(stk) до тех пор, пока не будет обнаружен '('
            }
            else if (c == ')') {
                while (!stk.isEmpty()
                        && stk.peek() != '(') {
                    postfix.append(stk.pop());
                }
                stk.pop();  // отбросить '(', извлекая его из стека
            }
            else {
                    // если встреченный символ не является круглой скобкой или операндом, то проверяем
                    // приоритет оператора, извлекаем стек и добавляем его в выходные данные
                    // до тех пор, пока верхняя часть стека не будет иметь более низкий
                    // приоритет, чем текущий символ
                while (!stk.isEmpty()
                        && precedence(stk.peek())
                        >= precedence(c)) {
                    postfix.append(stk.pop());
                }
                stk.push(c); // перемещаем текущий оператор в стек
            }
        }
            // После обхода всей строки проверяем, пуст ли стек или нет. Если стек не
            // пустой, извлекаем стек и добавляем его в выходные данные*/
        while (!stk.isEmpty()) {
            postfix.append(stk.pop());
        }
        return postfix.toString();
    }

    // определяем метод для проверки приоритета оператора
    public static int precedence(char operator)
    {
        switch (operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter a Infix expression:");
        Scanner sc = new Scanner(System.in);
        String infix = sc.next();
        sc.close();
        String postfix = infixToPostfix(infix);
        System.out.println("Postfix Expression: \n" + postfix);
    }
}
