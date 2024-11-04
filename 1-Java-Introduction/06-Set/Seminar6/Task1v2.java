/*Создайте HashSet, LinkedHashSet, TreeSet, заполните их следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}
Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.Распечатайте содержимое данного множества.
Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5,6, 3}. Распечатайте содержимое данного множества.
Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}.Распечатайте содержимое данного множества. 
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task1v2 {
    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        //hashSet.add(5);
        System.out.println(hashSet);

        Set<Integer> linkedHashSet = new LinkedHashSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        System.out.println(linkedHashSet);        

        Set<Integer> treeSet = new TreeSet<>(Arrays.asList(3, 6, 43, 8, 11, 7, 33, 3, 4, 8));
        System.out.println(treeSet);

    }
}