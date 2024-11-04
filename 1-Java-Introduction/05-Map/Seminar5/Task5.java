/*Написать метод, который переведёт данное целое число в римский формат 
 */
import java.util.TreeMap;

public class Task5 {
    public static void main(String[] args) {
        int number = 51;
        if (number > 3999)
            System.out.println("Я не знаю как это сделать");
        else {
            System.out.println("Числу " + number + " ссответствует римское число " + romanNumber(number));
        }
    }

    static String romanNumber(int num) {
        StringBuilder result = new StringBuilder();
        TreeMap<Integer, String> hashNumbers = arabicRomanTreeMap();
        int romanKey = 3000;
        while (romanKey > 1) {
            if (num == 0) break;
            if (num >= romanKey) {
                result.append(hashNumbers.get(romanKey));
                num -= romanKey;
                romanKey = hashNumbers.lowerKey(romanKey);
            } else {
                romanKey = hashNumbers.lowerKey(romanKey);
            }
        }
        if (num == 1) result.append("I");
        return result.toString();
    }

    private static TreeMap<Integer, String> arabicRomanTreeMap() {
        TreeMap<Integer, String> hashNumbers = new TreeMap<>();
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
