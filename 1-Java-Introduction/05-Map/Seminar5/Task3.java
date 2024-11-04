/*Написать программу, определяющую правильность расстановки скобок в выражении
Примеры:
Пример 1: a+(d_3) - истинаПример 2: [a+(1_3) - ложьПример 3: [6+(3_3)] - истинаПример 4: {a}[+]{(d_3)} - истинаПример 5: <{a}+{(d_3)}> - истинаПример 6: {a+]}{(d_3)} - ложь 
 */
// Написать программу, определяющую правильность расстановки скобок в выражении.
// Пример 1: a+(d*3) - истина
// Пример 2: [a+(1*3) - ложь
// Пример 3: [6+(3*3)] - истина
// Пример 4: {a}[+]{(d*3)} - истина
// Пример 5: <{a}+{(d*3)}> - истина
// Пример 6: {a+]}{(d*3)} - ложь
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Task3 {
    static boolean verifyExpression(String expression) {
        Map<Character, Character> brMap = getBracketsMap();
        Stack<Character> opendedBrackets = new Stack<>();

        for (Character br : expression.toCharArray()) {
            if (brMap.containsValue(br)) {
                opendedBrackets.push(br);
            } else if (brMap.containsKey(br)) {
                if (opendedBrackets.empty() || opendedBrackets.pop() != brMap.get(br)) {
                    return false;
                }
            }
        }

        return opendedBrackets.empty();
    }

    private static Map<Character, Character> getBracketsMap() {
        Map<Character, Character> bracketsMap = new HashMap<>();
        bracketsMap.put(')', '(');
        bracketsMap.put(']', '[');
        bracketsMap.put('}', '{');
        bracketsMap.put('>', '<');

        return bracketsMap;
    }

    public static void main(String[] args) {
        String[] expressionsArr = { "a+(d*3)", "[a+(1*3)", "[6+(3*3)]", "{a}[+]{(d*3)}", " <{a}+{(d*3)}>",
                "{a+]}{(d*3)}" };

        for (String exp : expressionsArr) {
            System.out.println(verifyExpression(exp));
        }
    }
}
