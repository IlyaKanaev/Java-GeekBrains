package Seminar1;
/*
 * Дан массив nums = [3,2,2,3] и число val = 3.
Если в массиве есть числа, равные заданному, нужно перенестиэти элементы в конец массива.Таким образом, первые несколько (или все) элементов массивадолжны быть отличны от заданного, а остальные - равны ему.
 */

 public class Task5 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 2, 3};
        int val = 3;
        int[] result = new int[nums.length];
        int j =0;
        int k = nums.length - 1;    // в отличии от python не прошло просто int k = - 1;
        for (int i = 0; i < nums.length; i++)   {
            if (nums[i] == val) {
                result[k] = val;
                k--;
            }
            else {
                result[j] = nums[i];
                j++;
            }
        }
        for (int i = 0; i < result.length; i++) {   // можно одновременно приравнять элементы исходного массива если нужно
            System.out.print(result[i]);  
        }          
    }
}

// import java.util.Arrays;

// public class SortNums {

//   public static void main(String[] args) {
//     int[] array1 = { 3, 2, 2, 3 };
//     int[] array = { 1, 2, 3, 4, 5, 3, 6, 7, 3, 3, 8, 9, 3 };
//     int val = 3;
//     int right = array.length - 1;
//     while (array[right] == val) {
//       right--;
//     }
//     for (int left = 0; left < right; left++) {
//       if (array[left] == val) {
//         array[left] = array[right];
//         array[right] = val;
//         right--;
//       }
//     }
//     System.out.println(Arrays.toString(array));
//   }
// }
