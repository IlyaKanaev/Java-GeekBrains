package Homework3;
/*
 * Внутри класса MergeSort напишите метод mergeSort, который принимает массив целых чисел, реализует алгоритм сортировки слиянием

Метод должен возвращать отсортированный массив. Пример:

a = {5, 1, 6, 2, 3, 4} -> [1, 2, 3, 4, 5, 6]
 */
import java.util.Arrays;

class MergeSort {
    public static int[] mergeSort(int[] a) {
        // Напишите свое решение ниже
        int leftBorder = 0;
        int rightBorder = a.length - 1;
        sort(a, leftBorder, rightBorder);
        return a;
    }
     // в параметрах сам массив и индексы его левой и правой границы   
     static void sort(int[] nums, int left, int right) {    
        if (left < right) {               // условие выхода из рекурсии при "бесконечном" делении массива
            int m = (left + right) / 2;     // ищем индекс середины массива
            sort(nums, left, m);            // рекурсивно сортируем левую половину
            sort(nums, m + 1, right);   // рекурсивно сортируем правую половину
            merge(nums, left, m, right);    // объединяем половинки с помощью нашей функции merge()
        }
    }
    // собственно слияние (merge) самая сложная часть алгоритма, поэтому для него отдельный метод
    static void merge(int nums[], int left, int m, int right) {
        int n1 = m - left + 1; // определяем количество элементов в каждой половине
        int n2 = right - m;
        int[] LeftPartArray = new int[n1];  // создаем подмассив под каждую половинку
        int[] RightPartArray = new int[n2];
        // заполняем подмассивы значениями из отрезка исходного массива (копируем)
        System.arraycopy(nums, left, LeftPartArray, 0, n1);
        // оставил для наглядности то, что с помощью компилятора я заменил на System.arraycopy
//        for (int i = 0; i < n1; i++)
//            LeftPartArray[i] = nums[left + i];
        System.arraycopy(nums, m + 1, RightPartArray, 0, n2);
//        for (int j = 0; j < n2; j++)
//            RightPartArray[j] = nums[m + 1 + j];
        int i = 0, j = 0;
        int k = left;
        while (i < n1 && j < n2) {  // проходим одновремеенно левую и правильную половинки
// т.к. есть копии, то можно уже заполнять отрезок исходного массива локально отсортированными значениями
            if (LeftPartArray[i] <= RightPartArray[j]) {
                nums[k] = LeftPartArray[i];
                i++;
            } else {
                nums[k] = RightPartArray[j];
                j++;
            }
            k++;
        }
        // а вот следующий кусок я вообще не понял для чего, но без него лажа выходит
        while (i < n1) {
            nums[k] = LeftPartArray[i];
            i++;
            k++;
        }
        while (j < n2) {
            nums[k] = RightPartArray[j];
            j++;
            k++;
        }
    }    
}

// Не удаляйте этот класс - он нужен для вывода результатов на экран и проверки
public class Task1{ 
    public static void main(String[] args) { 
        int[] a;

        if (args.length == 0) {
        // При отправке кода на Выполнение, вы можете варьировать эти параметры
            a = new int[]{5, 1, 6, 2, 3, 4};
        } else {
            a = Arrays.stream(args[0].split(", ")).mapToInt(Integer::parseInt).toArray();
        }

        MergeSort answer = new MergeSort();
        String itresume_res = Arrays.toString(answer.mergeSort(a));
        System.out.println(itresume_res);
    }
}
