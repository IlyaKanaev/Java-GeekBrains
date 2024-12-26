package Model;

import Controller.Interfaces.iGetModel;
import Model.Domain.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Реализация интерфейса iGetModel с использованием HashMap для хранения студентов.
 */
public class ModelClassHash implements iGetModel {
    private Map<Integer, Student> studentHashMap;

    /**
     * Конструктор класса ModelClassHash.
     * @param studentHashMap HashMap для хранения студентов.
     */
    public ModelClassHash(Map<Integer, Student> studentHashMap) {
        this.studentHashMap = studentHashMap;
    }

    /**
     * Добавляет студента в HashMap.
     * @param id      Идентификатор студента.
     * @param student Объект студента.
     */
    public void addStudent(int id, Student student) {
        studentHashMap.put(id, student);
    }

    /**
     * Получает список студентов из HashMap.
     * @return Список студентов.
     */
    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(studentHashMap.values());
    }

    /**
     * Получает HashMap студентов.
     * @return HashMap, где ключ - идентификатор студента, значение - объект студента.
     */
    @Override
    public Map<Integer, Student> getStudentMap() {
        return studentHashMap;
    }

    /**
     * Удаляет студента из HashMap по его идентификатору.
     * @param studentId Идентификатор удаляемого студента.
     */
    @Override
    public void removeStudent(int studentId) {
        // Удаляем студента из HashMap по его id
        studentHashMap.remove(studentId);
    }
}
