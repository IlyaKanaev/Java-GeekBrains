package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.List;

/**
 * Реализация интерфейса iGetModel с использованием списка для хранения студентов.
 */
public class ModelClass implements iGetModel {
    private List<Student> students;

    /**
     * Конструктор класса ModelClass.
     *
     * @param students Список студентов.
     */
    public ModelClass(List<Student> students) {
        this.students = students;
    }

    /**
     * Получает список студентов.
     *
     * @return Список студентов.
     */
    public List<Student> getStudents() {
        return students;
    }

    /**
     * Удаляет студента из списка по его идентификатору.
     *
     * @param studentId Идентификатор удаляемого студента.
     */
    @Override
    public void removeStudent(int studentId) {
        // Удаляем студента из списка по его id
        students.removeIf(student -> student.getId() == studentId);
    }
}
