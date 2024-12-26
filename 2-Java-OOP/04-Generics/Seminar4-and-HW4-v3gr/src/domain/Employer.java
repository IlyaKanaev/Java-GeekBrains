package domain;

public class Employer extends Worker {
    private String special;

    public Employer(String name, int age, String special) {
        super(name, age);
        this.special = special;
    }
}