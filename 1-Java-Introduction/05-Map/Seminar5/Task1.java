/*Создать структуру для хранения Номеров паспортов и Фамилийсотрудников организации
Образец ввода
123456 Иванов321456 Васильев234561 Петрова234432 Иванов654321 Петрова345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов
Образец вывода
123456 Иванов234432 Иванов345678 Иванов 
 */
import java.io.IOException;
import java.util.*;

import static java.lang.System.in;

public class Task1 {

    public static void main(String[] args) throws IOException {
        HashMap<Integer, String> passportNumber = new HashMap<Integer, String>();
        Scanner input = new Scanner(in);
        String userInput = "";
        String[] userIn;
        do {
            System.out.print("Введите номер паспорта и фамилию через пробел или end для выхода: ");
            userInput = input.nextLine();
            if (!Objects.equals(userInput, "end")) {
                userIn = userInput.split(" ");
                passportNumber.put(Integer.parseInt(userIn[0]), userIn[1]);
            }
        }
        while (!Objects.equals(userInput, "end"));

        System.out.print("Введите фамилию: ");
        userInput = input.nextLine();
        for (Map.Entry<Integer, String> entry : passportNumber.entrySet()) {
            if (Objects.equals(entry.getValue(), userInput))
                System.out.println(entry.getKey() + " " + entry.getValue());
        }
        in.close();
    }
}