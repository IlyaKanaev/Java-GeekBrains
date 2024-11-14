package homework2;
/*Написать функцию, возвращающую разницу между самым большим и самым маленьким элементами
переданного не пустого массива.*/

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 2, 5, 3, 4, 1, 5, 9, 7};
        System.out.println(getDifference(arr));

    }

    public static int getDifference(int[] arr) {
        int min = arr[0];
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max - min;
    }
}
