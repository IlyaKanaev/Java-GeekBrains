/*Взять набор строк, например: “Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.”
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”. 
 */
import java.util.*;

public class Task6 {

    public static void main(String[] args) {
        String str1 = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.";
        System.out.println(sortString(str1));
    }

    static LinkedHashMap<String, Integer> sortString(String str) {
        TreeMap<String, Integer> treeMapSort = new TreeMap<>();
        String[] words = str.split(" ");
        for (String word : words) {
            treeMapSort.put(word, word.length());
        }
        // не нашел способа сортировки по значениям в TreeMap
        // LinkedHashMap сохраняет порядок добавления элементов, поэтому буду вынимать minValue из TreeMap
        LinkedHashMap<String,Integer> linkedHashMap = new LinkedHashMap<>();
        // перебор в TreeMap возможен, кажется, только с помощью итератора, а итератору зачем-то нужен set (набор)
        Set<Map.Entry<String, Integer>> set = treeMapSort.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = set.iterator();
        int minValue = 100; // слов больше 100 знаков не найти, поэтому, увы, магическое число
        String minValueKey = "";
        while (iterator.hasNext()) {    // для сортировки понадобится вложенный цикл
            while (iterator.hasNext()) {
                Map.Entry<String, Integer> entry = iterator.next();
                String key = entry.getKey();
                Integer value = entry.getValue();
                if (value < minValue) {
                    minValue = value;
                    minValueKey = key;
                }
            }
            linkedHashMap.put(minValueKey, minValue); // добавляем в итоговвый список пару с min значением
            treeMapSort.remove(minValueKey); // и убираем эту пару из treeMapSort для следующей итерации
            minValue = 100;
            minValueKey = "";
            set = treeMapSort.entrySet(); // раз изменили treeMapSort приходится переопределять set и итератор
            iterator = set.iterator();
        }
        return  linkedHashMap;
    }
}
