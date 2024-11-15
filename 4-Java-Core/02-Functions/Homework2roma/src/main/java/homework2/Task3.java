package homework2;

/*Написать функцию, возвращающую истину, если в переданном массиве есть два соседних элемента, с нулевым значением.*/
public class Task3 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7, 8, 9, 0};
        System.out.println(findNeighborZero(arr));
    }

    public static boolean findNeighborZero(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == 0 && arr[i+1] == 0) {
                return true;
            }
        }
        return false;
    }
}
