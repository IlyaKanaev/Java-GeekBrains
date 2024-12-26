package services;
/**
 * Класс TeacherService обслуживающий учителей
 */

import domain.PersonComparator;
import domain.Teacher;

import java.util.ArrayList;
import java.util.List;

public class TeacherService implements iPersonService<Teacher> {
    private int count;
    // Список учителей
    private List<Teacher> teachers;

    /**
     * Конструктор класса TeacherService
     */
    public TeacherService() {
        teachers = new ArrayList<>();
    }
    // Метод сортировки учителей
    public void sortByFIO(){
        PersonComparator<Teacher> teachCom = new PersonComparator<>();
        teachers.sort(teachCom);
    }

    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     *Метод создания нового учителя
     * @param name - имя учителя
     * @param age - возраст учителя
     */

    @Override
    public void create(String name, int age) {
        Teacher teacher = new Teacher(name, age, "Профессор");
        count++;
        teachers.add(teacher);

    }
}
