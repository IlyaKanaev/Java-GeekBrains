/*Реализовать стэк с помощью массива.
Нужно реализовать методы:size(), empty(), push(), peek(), pop() 
 */
import java.util.Stack;

public class Task4 {
    public static void main(String[] args) {

        String[] myArray = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        Stack<Object> stack = new Stack<>();
        for (String str : myArray) {
            stack.push(str);               // добавляем элементы
        }
        System.out.println(stack);
        System.out.println(stack.size());  // вычисляем размер stack
        System.out.println(stack.empty()); // проверяем, пустой ли stack?
        System.out.println(stack.peek());  // возвращаем, но не удаляем элемент с вершины stack
        System.out.println(stack);         // проверяем, не удалили ли чего
        System.out.println(stack.pop());   // удаляем и возвращаем элемент с вершины stack
        System.out.println(stack);         // убеждаемся, что элемент удален
    }
}
