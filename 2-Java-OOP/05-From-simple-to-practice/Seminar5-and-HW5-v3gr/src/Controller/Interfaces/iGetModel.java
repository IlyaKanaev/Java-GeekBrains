package Controller.Interfaces;

import Model.Domain.Student;

import java.util.List;
import java.util.Map;

/**
 * Интерфейс, предоставляющий методы для получения данных о студентах.
 */
public interface iGetModel {
    /**
     * Получает список студентов.
     * @return Список студентов.
     */
    List<Student> getStudents();

    /**
     * Удаляет студента по индексу.
     * @param index Индекс удаляемого студента.
     */
    void removeStudent(int index);

    /**
     * Получает Map студентов.
     * @return Map, где ключ - идентификатор студента, значение - объект студента.
     * @throws UnsupportedOperationException если метод не поддерживается в текущей реализации.
     */
    default Map<Integer, Student> getStudentMap() {
        throw new UnsupportedOperationException("Этот метод не поддерживается в текущей реализации");
    }
}
