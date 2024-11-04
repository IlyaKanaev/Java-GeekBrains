/*Создайте HashSet, LinkedHashSet, TreeSet, заполните их следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}
Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.Распечатайте содержимое данного множества.
Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,6, 3}. Распечатайте содержимое данного множества.
Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.Распечатайте содержимое данного множества. 
 */
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1 {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 4, 5, 6, 3};
        Set<Integer> myHashSet = new HashSet<>();
        for (int i : arr) {
            myHashSet.add(i);
        }
        System.out.println(myHashSet);
        Set<Integer> myLinkedHashSet = new LinkedHashSet<>(myHashSet);
        System.out.println(myLinkedHashSet);
        Set<Integer> myTreeSet = new TreeSet<>(myHashSet);
        System.out.println(myTreeSet);
    }
}