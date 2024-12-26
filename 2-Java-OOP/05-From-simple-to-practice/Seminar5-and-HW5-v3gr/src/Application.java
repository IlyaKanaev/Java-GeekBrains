import Controller.ControllerClass;
import Controller.Interfaces.iGetModel;
import Controller.Interfaces.iGetView;
import Model.ModelClass;
import Model.ModelClassHash;
import Model.Domain.Student;
import View.ViewClass;
import View.ViewClassEng;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Главный класс приложения, содержащий метод main.
 */
public class Application {
    public static void main(String[] args) {
        // Создаем объекты студентов
        Student student_01 = new Student("Петя", 23);
        Student student_02 = new Student("Даня", 28);
        Student student_03 = new Student("Даша", 18);
        Student student_04 = new Student("Маша", 22);
        Student student_05 = new Student("Анна", 18);
        Student student_06 = new Student("Рома", 22);
        Student student_07 = new Student("Никита", 24);
        Student student_08 = new Student("Дима", 28);
        Student student_09 = new Student("Женя", 28);
        Student student_10 = new Student("Паша", 22);
        Student student_11 = new Student("Яна", 22);
        Student student_12 = new Student("Евгения", 22);

        // Создаем новый список студентов
        List<Student> list_01 = new ArrayList<>();

        // Добавляем студентов в список
        list_01.add(student_01);
        list_01.add(student_02);
        list_01.add(student_03);
        list_01.add(student_04);
        list_01.add(student_05);
        list_01.add(student_06);
        list_01.add(student_07);
        list_01.add(student_08);
        list_01.add(student_09);
        list_01.add(student_10);
        list_01.add(student_11);
        list_01.add(student_12);

        // Создаем новый список студентов
        Map<Integer, Student> studentHashMap = new HashMap<>();
        ModelClassHash modelHash = new ModelClassHash(studentHashMap);

        // Добавляем студентов в HashMap
        modelHash.addStudent(student_01.getId(), student_01);
        modelHash.addStudent(student_02.getId(), student_02);
        modelHash.addStudent(student_03.getId(), student_03);
        modelHash.addStudent(student_04.getId(), student_04);
        modelHash.addStudent(student_05.getId(), student_05);
        modelHash.addStudent(student_06.getId(), student_06);
        modelHash.addStudent(student_07.getId(), student_07);
        modelHash.addStudent(student_08.getId(), student_08);
        modelHash.addStudent(student_09.getId(), student_09);
        modelHash.addStudent(student_10.getId(), student_10);
        modelHash.addStudent(student_11.getId(), student_11);
        modelHash.addStudent(student_12.getId(), student_12);

        // Создаем объекты моделей и представлений
        iGetModel model1 = new ModelClass(list_01); // создаем модель из списка List
        iGetModel model2 = new ModelClassHash(studentHashMap); // создаём модель  из HashMap

        iGetView view = new ViewClass(); // создаём объект на русском
        iGetView enView = new ViewClassEng(); // создаём объект на английском

        // Создаем объекты контроллеров
        ControllerClass controller1 = new ControllerClass(model1, view);
        ControllerClass controller2 = new ControllerClass(model1, enView);
        ControllerClass controller3 = new ControllerClass(model2, view);

        // Запускаем контроллер для работы с ModelClassHash
        controller1.update("Run"); // контролер с русским названием и списком List
        controller2.update("Run"); // контролер с английским названием и списком List
        controller3.run(); // контролер с русским названием и списком HashMap
    }
}
