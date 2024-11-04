/*Создать структуру для хранения Номеров паспортов и Фамилийсотрудников организации
Образец ввода
123456 Иванов321456 Васильев234561 Петрова234432 Иванов654321 Петрова345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов
Образец вывода
123456 Иванов234432 Иванов345678 Иванов 
 */
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Task1v2 {
    public static void main(String[] args) {
        Map<Integer, String> passportData = new TreeMap<>();
        passportData.put(123456, "Иванов");
        passportData.put(321456, "Васильев");
        passportData.put(234561, "Петрова");
        passportData.put(234432, "Иванов");
        passportData.put(654321, "Петрова");
        passportData.put(345678, "Иванов");

        String targetName = "Иванов";
        for (Integer passportNumber : passportData.keySet()) {
            String name = passportData.get(passportNumber);
            if(name.equals(targetName)){
                System.out.println("Номер паспорта: " + passportNumber + ", Фамилия: " + name);
            }
        }

    }
}
