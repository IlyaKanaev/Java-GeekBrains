/*Реализовать консольное приложение, которое:
Принимает от пользователя строку вида text~num
 * Нужно рассплитить строку по ~, сохранить text в связный список напозицию num.
 * Если введено print~num, выводит строку из позиции num в связномсписке и удаляет её из списка
 */
import java.util.*;

public class Task1 {
    public static void main(String[] args) {
        // 1.
        Scanner input = new Scanner(System.in);
        System.out.print("Input your text: ");
        String textInput = input.next();
        // 2.
        String[] words = textInput.split("~");  // создаем массив (из 2х элементов) и сплитим в него строку
        System.out.println(Arrays.toString(words));   // печатаем массив как строку (с помощью Arrays.toString()
        int num = Integer.parseInt(words[1]);       // парсим втрой элемент массива в число (exception не рассматриваем)
        List<String> linkList = new LinkedList<String>();   // создаем LinkedList (связный список)
        for (int i = 0; i < num; i++)   // заполняем случайными значениями LinkedList , чтобы на позиции num вставить
            linkList.add("a");          // наш текст (так я понял условие)
        linkList.add(words[0]);
        System.out.println(linkList);
        //3
        String commandRemove = "print~" + Integer.toString(num); // создаем команду для удаления элемента из коллекции
        System.out.print("Input your command: ");
        textInput = input.next(); // используем уже использованную переменную textInput для получения команды
        if (Objects.equals(textInput, commandRemove)) { // сравниваем введенную пользователем команду
            System.out.println(linkList.get(num));
            linkList.remove(num);
        }
        System.out.println(linkList);
    }
}