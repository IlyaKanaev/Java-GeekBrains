/*Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введеннаябыла первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти 
 */
import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        // 1.
        LinkedList<String> linkList = new LinkedList<String>();   // создаем LinkedList (связный список)
        Scanner input = new Scanner(System.in);
        String textInput = "";
        do {
            System.out.print("Input your text ('print', 'revert, 'end' - commands): ");
            textInput = input.next();
            if (Objects.equals(textInput, "print")) {
                Collections.swap(linkList, 0 , linkList.size() - 1);
                System.out.println(linkList);
            }
            else if (Objects.equals(textInput, "revert")) {
                linkList.removeLast();  // если бы в самом начале был List<String> linkList - не получилось бы так
                System.out.println(linkList);
            }
            else {
                if (!Objects.equals(textInput, "end"))
                    linkList.add(textInput);
                System.out.println(linkList);
            }
        }
        while (!Objects.equals(textInput, "end"));
    }
}
