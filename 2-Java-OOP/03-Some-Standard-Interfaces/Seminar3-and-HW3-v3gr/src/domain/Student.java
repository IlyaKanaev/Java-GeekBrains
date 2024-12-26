package domain;

/**
 * Класс студента. Является наследником абстрактного класса Person.
 * Расширяет его двумя полями
 * int id - идентификатор студента
 * int generalId - внутренняя переменная для посчёта всех созданых студентов
 */
public class Student extends Person implements Comparable<Student> {
    private int id;
    static  int generalId;

    // Конструктор, который наследует от Person super(name, age), и присваивает идентификатор
    // новому студенту. Так же инкриментирует поле общее число студентов
    public Student(String name, int age) {
        super(name, age);
        this.id = generalId;
        generalId ++;
    }
    // Методы геттеры и сеттеры
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    // Переопределение метода toString
    @Override
    public String toString() {
        StringBuilder studentString = new StringBuilder();
        studentString.append("Студент {id= ").append(id).append("\t")
                .append(super.toString()).append("}");
        return studentString.toString();
    }
    // Переопределение метода сравнения и сортировки студентов
    @Override
    public int compareTo(Student o) {
        // Выполняем сортировку списка по возрасту студентов
        if (o.getAge() > super.getAge()) {
            return -1;
        }
        if (o.getAge() < super.getAge()) {
            return 1;
        }
        // Если есть одинаковые студенты, то выполняем сортировку по идентификатору
        if (o.getId() > getId()) {
            return -1;
        }
        if (o.getId() < getId()) {
            return 1;
        }
        return 0;
    }
}
