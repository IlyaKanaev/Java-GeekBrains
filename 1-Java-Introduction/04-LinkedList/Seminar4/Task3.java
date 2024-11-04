/*Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка
Написать метод, который принимает массив элементов, помещает их вочередь и выводит на консоль содержимое очереди. 
 */
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Task3 {
    public static void main(String[] args) {
        // 1.
        String[] myArray = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
        Stack<Object> stack = new Stack<>();
        for (String str : myArray) {
            stack.push(str);
        }
        System.out.println(stack);
        // 2.
        Queue<Object> queue = new PriorityQueue<>();
        queue.addAll(Arrays.asList(myArray));
        System.out.println(queue);
    }
}
