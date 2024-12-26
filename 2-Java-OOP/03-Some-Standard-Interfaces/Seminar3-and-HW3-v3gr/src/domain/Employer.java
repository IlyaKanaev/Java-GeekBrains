package domain;

public class Employer extends Person {
    private String special;

    public Employer(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }
}
