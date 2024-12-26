package View;

import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

/**
 * Класс, представляющий реализацию интерфейса iGetView для отображения данных и взаимодействия с пользователем на английском языке.
 */
public class ViewClassEng implements iGetView {

    /**
     * Выводит информацию о всех студентах на английском языке.
     * @param students Список студентов для отображения.
     */
    @Override
    public void printAllStudents(List<Student> students) {
        System.out.println("---------List of Students--------");
        for (Student s : students) {
            System.out.println(s);
        }
        System.out.println("_______________________________");
    }

    /**
     * Запрашивает ввод пользователя с заданным сообщением.
     * @param msg Сообщение для пользователя.
     * @return Строка введенная пользователем.
     */
    @Override
    public String prompt(String msg) {
        Scanner in = new Scanner(System.in);
        System.out.println(msg);
        return in.nextLine();
    }
}
