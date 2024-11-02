package Seminar1;
/*
 * Напишите метод, который находит самую длинную строку общего префикса среди массива строк.
Если общего префикса нет, вернуть пустую строку "”
 */

 public class Task6 {
    public static void main(String[] args) {
        String[] array = {"abc", "abcd", "abcde"};
        String max_prefix = max_prefix(array);
        System.out.print(max_prefix);
    }

    public static String max_prefix(String[] array) {
        String result = "";
        String prefix = "";
        char letter = array[0].charAt(0);
        for (int i = 0; i < min_length_string(array); i++) {
            letter = array[0].charAt(i);
            for (int j = 0; j < array.length; j++)   {
                if (letter == array[j].charAt(i))   {
                    prefix = array[0].substring(0, i+1);
                }
                else return result = prefix;
            }
            result = prefix;
        }
        return result;
    }

    public static int min_length_string(String[] array) {
        int min_length = array[0].length();
        for (int i = 0; i < array.length; i++)  {
            if (array[i].length() < min_length) {
                min_length = array[i].length();
            }
        }
        return min_length;
    }
}

// public class MaxPrefix {

//     public static void main(String[] args) {
//         String[] strs = { "flower", "flow", "flight" }; // fl

//         System.out.println(maxPrefix(strs));
//     }

//     static String maxPrefix(String[] wordsArr) {
//         String pref = wordsArr[0];

//         for (int i = 1; i < wordsArr.length; i++) {
//             while (wordsArr[i].indexOf(pref) != 0) {
//                 pref = pref.substring(0, pref.length() - 1);
//                 if (pref.isEmpty()) {
//                     return pref;
//                 }
//             }
//         }

//         return pref;
//     }
// }
