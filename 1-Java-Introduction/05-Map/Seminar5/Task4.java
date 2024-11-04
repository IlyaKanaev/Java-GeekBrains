/*Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022 
 */
import java.util.HashMap;
import java.util.Set;

public class Task4 {

    public static void main(String[] args) {
        String romanNumber = "MMXXII";
        System.out.println("Римское число " + romanNumber + " равно " + arabicNumber(romanNumber));
    }

    static int arabicNumber(String numRoman) {
        HashMap<Integer, String> hashNumbers = arabicRomanTreeMap();
        Set keyset = hashNumbers.keySet();      // получаем набор ключей в таблице arabicRomanTreeMap
        // создаем HashMap чтобы поменять местами ключи и значения
        HashMap<String, Integer> hashNumbers2 = new HashMap<>();
        for (Object key : keyset) {
            hashNumbers2.put(hashNumbers.get(key), (Integer) key);
        }
        int result = 0;
        for (int i = 0; i < numRoman.length(); i++) {
            String letterRoman = String.valueOf(numRoman.charAt(i));
            result += hashNumbers2.get(letterRoman);
        }
        return result;
    }

    private static HashMap<Integer, String> arabicRomanTreeMap() {
        HashMap<Integer, String> hashNumbers = new HashMap<>();
        hashNumbers.put(1, "I");
        hashNumbers.put(2, "II");
        hashNumbers.put(3, "III");
        hashNumbers.put(4, "IV");
        hashNumbers.put(5, "V");
        hashNumbers.put(6, "VI");
        hashNumbers.put(7, "VII");
        hashNumbers.put(8, "VIII");
        hashNumbers.put(9, "IX");
        hashNumbers.put(10, "X");
        hashNumbers.put(20, "XX");
        hashNumbers.put(30, "XXX");
        hashNumbers.put(40, "XL");
        hashNumbers.put(50, "L");
        hashNumbers.put(60, "LX");
        hashNumbers.put(70, "LXX");
        hashNumbers.put(80, "LXX");
        hashNumbers.put(90, "XC");
        hashNumbers.put(100, "C");
        hashNumbers.put(200, "CC");
        hashNumbers.put(300, "CCC");
        hashNumbers.put(400, "CD");
        hashNumbers.put(500, "D");
        hashNumbers.put(600, "DC");
        hashNumbers.put(700, "DCC");
        hashNumbers.put(800, "DCCC");
        hashNumbers.put(900, "MX");
        hashNumbers.put(1000, "M");
        hashNumbers.put(2000, "MM");
        hashNumbers.put(3000, "MMM");
        return hashNumbers;
    }
}
