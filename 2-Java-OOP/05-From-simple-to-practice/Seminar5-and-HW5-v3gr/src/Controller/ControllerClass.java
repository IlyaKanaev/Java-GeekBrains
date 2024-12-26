package Controller;

import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.Domain.Student;

import java.util.List;
import java.util.Scanner;

/**
 * Класс контроллера, отвечающий за взаимодействие между моделью и представлением.
 */
public class ControllerClass {
    private iGetModel model;
    private iGetView view;

    /**
     * Конструктор класса контроллера.
     *
     * @param model Модель данных.
     * @param view  Представление данных.
     */
    public ControllerClass(iGetModel model, iGetView view) {
        this.model = model;
        this.view = view;
    }

    /**
     * Метод для проверки данных перед их обновлением.
     *
     * @param stud Список студентов.
     * @return true, если список не пустой; false, если список пустой.
     */
    private boolean testData(List<Student> stud) {
        return stud.size() > 0;
    }

    /**
     * Метод для обновления данных в соответствии с запросом.
     *
     * @param request Запрос на обновление данных.
     */
    public void update(String request) {
        List<Student> studBuffer = model.getStudents();
        if (testData(studBuffer)) {
            view.printAllStudents(studBuffer);
        } else {
            System.out.println("Список студентов пуст");
        }
    }

    /**
     * Метод для запуска основного цикла программы.
     */
    public void run() {
        Command com = Command.NONE;
        boolean getNewIter = true;

        while (getNewIter) {
            String command = view.prompt("Введите команду: ");
            com = Command.valueOf(command.toUpperCase());

            switch (com) {
                case EXIT:
                    getNewIter = false;
                    System.out.println("Выход из программы");
                    break;
                case LIST:
                    view.printAllStudents(model.getStudents());
                    break;
                case DELETE:
                    System.out.println("Введите номер студента для удаления: ");
                    Scanner getUserNumber = new Scanner(System.in);
                    int result = Integer.parseInt(getUserNumber.nextLine());

                    if (isValidStudentNumber(result, model.getStudents())) {
                        model.removeStudent(result);
                        System.out.println("Студент удален.");
                    } else {
                        System.out.println("Такого номера нет.");
                    }
                    break;
            }
        }
    }

    /**
     * Метод для проверки корректности номера студента.
     *
     * @param number  Номер студента.
     * @param students Список студентов.
     * @return true, если номер корректный; false, если номер некорректный.
     */
    private static boolean isValidStudentNumber(int number, List<Student> students) {
        return number >= 0 && number <= students.size();
    }
}