package gb_oop_java.sem5.cw.ex2.model;

public class Teacher extends User {
    private Integer id;

    public Teacher(String name, String secondName, Integer year, Integer id) {
        super(name, secondName, year);
        this.id = id;
    }

    public Integer getId() {
        return id;
    }
}
