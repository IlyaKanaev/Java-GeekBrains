package Seminar1;
/*
 * Задан массив, например, nums = [1,7,3,6,5,6].

Написать программу, которая найдет индекс i для этого массиватакой, что сумма элементов с индексами < i равна суммеэлементов с индексами > i.

Функциональность нужно реализовать в методе,который будет возвращать найденный индекс или -1,если такой индекс не найден
 */

 public class Task10 {
    public static void main(String[] args) {
    int[] nums = {1, 7, 3, 4, 6, 4, 5, 6};
    System.out.println(median_index(nums));    
    }

    public static int median_index(int[] array) {
        int sum = sum_elements(array, 0, array.length - 1);
        int left_sum = 0;
        int i = 0;
        while (left_sum < sum / 2)  {
            left_sum += array[i];
            i++;
        }
        left_sum = left_sum - array[i - 1];
        int right_sum = sum_elements(array, i, array.length - 1);
        if (right_sum >= sum / 2) return -1;
        if (right_sum == left_sum) return i;
        while (right_sum < sum / 2) {
            right_sum += array[i];
            left_sum = left_sum - array[i - 1];
            if (right_sum == left_sum) return i - 1;
            i--;
        }
        return -1;
    }

    public static int sum_elements(int[] array, int start_index, int end_index) {
        int result = 0;
        for (int i = start_index; i <= end_index; i++)  {
            result += array[i];
        }
        return result;
    }
}
