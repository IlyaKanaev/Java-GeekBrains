/*Написать метод, возвращающий количество чётных элементов массива.
countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами переданного не пустого массива.
Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением
*/
package org.example;

public class Homework2my {
    public static void main(String[] args) {
        int[] arr = {5, 3, 7, 0, 0, 4};
        System.out.println(countEvens(arr));
        System.out.println(difference(arr));
        System.out.println(doubleZero(arr));
    }
    /* 1. Написать метод, возвращающий количество чётных элементов массива.
    countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
     */
    public static int countEvens(int[] arr) {
        int count = 0;
        for (int number : arr) {
            if (number %2 == 0){
                count++;
            }
        }
        return count;
    }

    /* 2. Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
    переданного не пустого массива.
     */
    public static int difference(int [] arr){
        int min = 0;
        int max = 0;
        for (int number : arr) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        return max-min;
    }

    /* 3. Написать функцию, возвращающую истину, если в переданном массиве есть два соседних
    элемента, с нулевым значением.
     */
    public static boolean doubleZero(int[] arr){
        int previousNumber = arr[0]
        for (int i = 1; i < arr.length; i++) {
            if (previousNumber == 0) {
                if (arr[i] == 0) return true;
            }
            previousNumber = arr[i];
        }
        return false;
    }
}