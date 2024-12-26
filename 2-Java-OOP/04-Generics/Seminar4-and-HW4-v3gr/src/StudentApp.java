import controllers.AccountController;
import domain.*;
import services.TeacherService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Основной класс приложения StudentApp. Работает с классами и методами
 * созданными в пакете domain
 */
public class StudentApp {
    public static void main(String[] args) {
        //Создадим студентов

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

        Student student_13 = new Student("Марина", 18);
        Student student_14 = new Student("Татьяна", 19);
        Student student_15 = new Student("Наталья", 19);
        Student student_16 = new Student("Михаил", 18);
        Student student_17 = new Student("Даниил", 18);
        Student student_18 = new Student("Глеб", 23);

        //Создадим новый список студентов
        List<Student> list_01 = new ArrayList<>();

        list_01.add(student_01);
        list_01.add(student_02);
        list_01.add(student_03);
        list_01.add(student_04);
        list_01.add(student_05);
        list_01.add(student_06);

        List<Student> list_02 = new ArrayList<>();

        list_02.add(student_07);
        list_02.add(student_08);
        list_02.add(student_09);
        list_02.add(student_10);
        list_02.add(student_11);
        //list_02.add(student_12); // убираем элемент для проверки сортировки по числу студентов в группе

        List<Student> list_03 = new ArrayList<>();

        list_03.add(student_13);
        list_03.add(student_14);
        list_03.add(student_15);
        list_03.add(student_16);
        list_03.add(student_17);
        list_03.add(student_18);

        // Создаём группу студентов, в которую передаём список студентов и идентификатор группы
        StudentGroup group_1 = new StudentGroup(list_01, 1);
        StudentGroup group_2 = new StudentGroup(list_02, 2);
        StudentGroup group_3 = new StudentGroup(list_03, 3);

        // Воспользуемся стандартным интерфейсом сортировки коллекций
        Collections.sort(group_1.getList());
        Collections.sort(group_2.getList());
        Collections.sort(group_3.getList());

        // Создаем объект потока студентов
        StudentSteam studentSteam_01 = new StudentSteam(1);
        StudentSteam studentSteam_02 = new StudentSteam(2);

        // Добавляем группы в поток
        studentSteam_01.addStudentGroup(group_1);
        studentSteam_01.addStudentGroup(group_2);
        studentSteam_02.addStudentGroup(group_3);

        // Вызываем метод для сортировки групп в потоке по количеству студентов
        studentSteam_01.sortGroupsByNumberOfStudents();
        studentSteam_02.sortGroupsByNumberOfStudents();

        // Выводим информацию о потоке студентов
        // Переход на новую строку консоли
        System.out.println();
        System.out.println(studentSteam_01.toString());
        System.out.println(studentSteam_02.toString());


        Teacher t1 = new Teacher("Эдуард", 50, "Доцент");
        Employer e1 = new Employer("Фёдор", 35, "Дворник");

        AccountController controller = new AccountController();
        controller.paySalary(t1, 50000);
        controller.paySalary(e1, 25000);



    }
}