/*с помощью Set вычислите процент уникальных значений в данном массиве

Напишите метод, который заполнит массив из 1000 элементов случайнымицифрами от 0 до 24.

Создайте метод, в который передайте заполненный выше массив и спомощью Set вычислите процент уникальных значений в данном массиве иверните его в виде числа с плавающей запятой.Для вычисления процента используйте формулу:процент уникальных чисел = количество уникальных чисел * 100 / общееколичество чисел в массиве. 
 */
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {

    public static void main(String[] args) {
        int arraySize = 1000;
        int rangeOfValues = 25;
        int[] myArray = new int[arraySize];
        fillArray(myArray, rangeOfValues);
        percentUnique(myArray, arraySize);
    }

    private static void percentUnique(int[] myArray, int arraySize) {
        Set<Integer> uniques = new HashSet<>();
        Set<Integer> duplicates    = new HashSet<>();
        for (int i : myArray) {
            if (!uniques.add(myArray[i]))
                duplicates.add(myArray[i]);
        }
        int percentUniques = (uniques.size() - duplicates.size()) * 100 / arraySize;
        System.out.println("Percentage of unique values: " + percentUniques);
    }

    private static void fillArray(int[] myArray, int rangeOfValues) {
        Random rand = new Random();
        for (int i : myArray) {
            myArray[i] = rand.nextInt(rangeOfValues);
        }
    }
}