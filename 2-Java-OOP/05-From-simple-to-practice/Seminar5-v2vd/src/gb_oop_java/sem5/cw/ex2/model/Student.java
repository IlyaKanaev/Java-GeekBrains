package gb_oop_java.sem5.cw.ex2.model;

public class Student extends User {
    private Integer id;

    public Student(String name, String secondName, Integer year, Integer id) {
        super(name, secondName, year);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Override
    public String toString() {
        return "ID - '" + id + '\'' +
                ", Имя - '" + getName() + '\'' +
                ", Фамилия - '" + getSecondName() + '\'' +
                ", Год рождения - " + getYear()
                ;
    }
}
