/*Даны 2 строки, написать метод, который вернет true, если эти строки являются изоморфнымии false, если нет
Строки изоморфны, если одну букву в первом слове можно заменить на некоторую букву во втором слове, при этом повторяющиеся буквы одного слова меняются на одну и ту же букву с сохранениемпорядка следования. (Например, add - egg изоморфны)
буква может не меняться, а остаться такой же. (Например, note - code)
Пример 1:
Input: s = "foo", t = "bar"Output: falseПример 2:Input: s = "paper", t = "title"Output: true 
 */
import java.util.HashMap;

public class Task2 {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        System.out.println(isomorphicCheck(s, t));
    }

    static boolean isomorphicCheck (String s2, String t2) {
        boolean result = true;
        if (s2.length() != t2.length()) return false;
        HashMap<Character, Character> hashCheck = new HashMap<Character, Character>();
        for (int i = 0; i < s2.length(); i++) {
            if (hashCheck.containsKey(s2.charAt(i))) {
                if (hashCheck.get(s2.charAt(i)) != t2.charAt(i)) return false;
            }
            hashCheck.put(s2.charAt(i), t2.charAt(i));
        }
        return result;
    }
}
