/*Написать метод, который переведет число из римского формата записи в арабский.
Например, MMXXII = 2022 
 */
import java.util.HashMap;
import java.util.Map;

public class Task4v2 {

    static int convertRomanToArabicNum(String romanNum) {
        Map<Character, Integer> map = getMapRomanArabicNums();
        int res = 0;
        int prevNum = 0;
        for (int i = romanNum.length()-1; i >= 0; i--) {
            int currentNum = map.get(romanNum.charAt(i));
            if (currentNum < prevNum) {
                res -= currentNum;
            } else {
                res += currentNum;
            }
            prevNum = currentNum;
        }
        return res;
    }

    

    private static Map<Character, Integer> getMapRomanArabicNums() {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        return map;
    }

    public static void main(String[] args) {
        System.out.println(convertRomanToArabicNum("LD"));
    }
}
