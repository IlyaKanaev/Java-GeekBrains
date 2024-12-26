package domain;

import java.util.Iterator;
import java.util.List;

/**
 * Класс StudentGroup объединяет список студентов в одну группу со своим идентификатором
 * List<Student> list - список студентов группы
 * int id - идентификатор группы
 * Класс использует стандартный интерфейс Java - Iterable
 */

public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    private List<Student> list;
    private int id;

    // Конструктор класса, принимает список группы и идентификатор
    public StudentGroup(List<Student> list, int id) {
        this.list = list;
        this.id = id;
    }
    // Методы геттеры и сеттеры
    public List<Student> getList() {
        return list;
    }

    public void setList(List<Student> list) {
        this.list = list;
    }

    public int getId() {
        return id;
    }

    // Переопределение метода toString для группы
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("\nГруппа студентов №").append(id);
        for (Student student : list) {
            result.append("\n\t").append(student.toString());
        }
        result.append("\n");
        return result.toString();
    }

    @Override
    public Iterator<Student> iterator() {
        return new StudentIterator(list);
    }
    @Override
    public int compareTo(StudentGroup otherGroup) {
        // Сравниваем группы по количеству студентов
        return Integer.compare(this.list.size(), otherGroup.list.size());
    }
}
