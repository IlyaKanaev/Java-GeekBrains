package Seminar1;
/*
 * Дан массив двоичных чисел, например [1,1,0,1,1,1], 
 * вывести максимальное количество подряд идущих 1.
 */

 public class Task4 {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};     // в условии массив в квадратных скобках почему-то
        int max_num_of_units = 0;
        int count_of_units = 0;
        for (int i = 0; i < nums.length; i++)   {
            if (nums[i] == 1) {     // можно было бы в одну строчку, но при отладке программы пригодились скобки для временной вствки print
                count_of_units++;
            }
            else if (count_of_units > max_num_of_units) {
                max_num_of_units = count_of_units;
                count_of_units = 0;
            }
        }
        if (count_of_units > max_num_of_units)  max_num_of_units = count_of_units;
        System.out.println("The number of consecutive units: " + max_num_of_units);
    }
}

// public class CountBinSeries {

//     public static void main(String[] args) {
//         int[] numsArr = { 1, 1, 0, 1, 1, 1 };

//         int counterMax = getCounterMax(numsArr);

//         System.err.println(counterMax);
//     }

//     private static int getCounterMax(int[] numsArr) {
//         int onesCounter = 0;
//         int counterMax = 0;
//         for (int num : numsArr) {
//             if (num == 1) {
//                 onesCounter++;
//                 // counterMax = counterMax > onesCounter ? counterMax : onesCounter;
//                 counterMax = Math.max(counterMax, onesCounter);
//             } else {
//                 onesCounter = 0;
//             }
//         }
//         return counterMax;
//     }
// }
