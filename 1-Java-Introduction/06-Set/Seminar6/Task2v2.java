/*с помощью Set вычислите процент уникальных значений в данном массиве

Напишите метод, который заполнит массив из 1000 элементов случайнымицифрами от 0 до 24.

Создайте метод, в который передайте заполненный выше массив и спомощью Set вычислите процент уникальных значений в данном массиве иверните его в виде числа с плавающей запятой.Для вычисления процента используйте формулу:процент уникальных чисел = количество уникальных чисел * 100 / общееколичество чисел в массиве. 
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2v2 {
    static int[] makeRandomNumbersArray(int size, int maxVal) {
        Random rand = new Random();
        int[] numbersArr = new int[size];

        for (int i = 0; i < size; i++) {
            numbersArr[i] = rand.nextInt(maxVal);
        }
        return numbersArr;
    }

    static double calcUniquePercentage(int[] arr) {
        Set<Integer> uniqueNumbers = new HashSet<>();

        for (Integer num : arr) {
            uniqueNumbers.add(num);
        }

        int arrSize = arr.length;
        int uniqueSize = uniqueNumbers.size();

        return (double) (uniqueSize * 100) / arrSize;
    }

    public static void main(String[] args) {
        int size = 1000;
        int maxVal = 25;

        int[] randNumsArr = makeRandomNumbersArray(size, maxVal);
        double res = calcUniquePercentage(randNumsArr);
        System.out.println(res);
    }
}