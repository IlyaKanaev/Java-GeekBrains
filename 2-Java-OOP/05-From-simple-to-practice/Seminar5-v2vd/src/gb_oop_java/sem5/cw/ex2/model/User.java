package gb_oop_java.sem5.cw.ex2.model;

import javax.xml.crypto.Data;

public abstract class User {
    private String name;
    private String secondName;
    private Integer year;

    public User(String name, String secondName, Integer year) {
        this.name = name;
        this.secondName = secondName;
        this.year = year;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public Integer getYear() {
        return year;
    }

    @Override
    public String toString() {
        return "Имя - '" + name + '\'' +
                ", Фамилия - '" + secondName + '\'' +
                ", Год рождения - " + year +
                '}';
    }
}
