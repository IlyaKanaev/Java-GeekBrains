package domain;

/**
 * Класс Учитель. Является наследником абстрактного класса Person.
 * Расширяет его одним полем
 * String academicDegree - учёная степень преподавателя
 *
 */

public class Teacher extends Worker {
    private String academicDegree;

    // Конструктор класса Teacher
    public Teacher(String name, int age, String academicDegree) {
        super(name, age);
        this.academicDegree = academicDegree;
    }
}