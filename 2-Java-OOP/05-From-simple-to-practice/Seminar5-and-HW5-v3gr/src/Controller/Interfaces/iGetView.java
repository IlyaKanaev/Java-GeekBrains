package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;

/**
 * Интерфейс, предоставляющий методы для отображения данных студентов и взаимодействия с пользователем.
 */
public interface iGetView {

    /**
     * Выводит информацию о всех студентах.
     * @param students Список студентов для отображения.
     */
    void printAllStudents(List<Student> students);

    /**
     * Запрашивает ввод пользователя с заданным сообщением.
     * @param msg Сообщение для пользователя.
     * @return Строка введенная пользователем.
     */
    String prompt(String msg);
}
