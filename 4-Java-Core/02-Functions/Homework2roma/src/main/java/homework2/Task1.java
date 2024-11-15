package homework2;

/*Написать метод, возвращающий количество чётных элементов массива. countEvens([2, 1, 2, 3, 4]) → 3
 *countEvens([2, 2, 0]) → 3 countEvens([1, 3, 5]) → 0
 * */
public class Task1 {
    public static void main(String[] args) {
        int[] arr = {2, 1, 2, 3, 4};
        System.out.println(countEvens(arr));
        int[] arr1 = {2, 2, 0};
        System.out.println(countEvens(arr1));
        int[] arr2 = {1, 3, 5};
        System.out.println(countEvens(arr2));
    }

    public static int countEvens(int[] arr) {
        int counter = 0;
        for (int j : arr) {
            if (j % 2 == 0) {
                counter++;
            }
        }
        return counter;
    }
}
