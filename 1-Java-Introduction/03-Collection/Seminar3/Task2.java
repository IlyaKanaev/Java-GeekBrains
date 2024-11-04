/*Заполнить список десятью случайными числами.

Отсортировать список методом sort() и вывести его на экран
 * 
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;
public class Task2 {
    public static void main(String[] args) {
    List<Integer> listNum = new ArrayList<Integer>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            listNum.add(random.nextInt());
        }
        System.out.println(listNum);
        Collections.sort(listNum);
        System.out.println(listNum);
    }    
}

// Variant 2
// package Seminar3;

// import java.util.ArrayList;
// import java.util.Collections;
// import java.util.List;
// import java.util.Random;

// public class SortedArrayList {
//     public static void main(String[] args) {
//         // ArrayList<Integer> numbers = new ArrayList<>();
//         int size = 10;
//         int min = 0;
//         int max = 100;
//         List<Integer> numbers1 = getRandom(size, max);
//         System.out.println(numbers1);

//         Collections.sort(numbers1);

//         System.out.println(numbers1);
//     }

//     private static List<Integer> getRandom(int size, int max) {
//         List<Integer> numbers1 = new ArrayList<>();
//         Random random = new Random();
//         for (int i = 0; i < size; i++) {
//             numbers1.add(random.nextInt(max));
//         }
//         return numbers1;
//     }
// }
