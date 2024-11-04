/*В классе MyQueue реализуйте очередь для типа данных Integer с помощью LinkedList со следующими методами:
enqueue() - помещает элемент в конец очередиdequeue() - возвращает первый элемент из очереди и удаляет егоfirst() - возвращает первый элемент из очереди, не удаляяgetElements() - возвращает все элементы в очереди 
// Пример 1:
queue.enqueue(1);
queue.enqueue(10);
queue.enqueue(15);
queue.enqueue(5);
System.out.println(queue.getElements());
// Результат:
[1, 10, 15, 5]
// Пример 2:
queue.dequeue();
queue.dequeue();
System.out.println(queue.getElements());
// Результат:
[15, 5]
// Пример 3:
System.out.println(queue.first());
// Результат:
15
 */
import java.util.LinkedList;

class MyQueueInt {
    private LinkedList<Integer> elements = new LinkedList<>();

    public void enqueue(int element) {
        elements.add(element);
    }

    public int dequeue() {
        return elements.removeFirst();
    }

    public int first() {
        return elements.getFirst();
    }

    public LinkedList<Integer> getElements() {
        return elements;
    }
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task2v2 {
    public static void main(String[] args) {
        MyQueueInt queue;
        queue = new MyQueueInt();

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            queue.enqueue(1);
            queue.enqueue(10);
            queue.enqueue(15);
            queue.enqueue(5);
        } else {
            queue.enqueue(Integer.parseInt(args[0]));
            queue.enqueue(Integer.parseInt(args[1]));
            queue.enqueue(Integer.parseInt(args[2]));
            queue.enqueue(Integer.parseInt(args[3]));
        }

        System.out.println(queue.getElements());

        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.getElements());

        System.out.println(queue.first());
    }
}