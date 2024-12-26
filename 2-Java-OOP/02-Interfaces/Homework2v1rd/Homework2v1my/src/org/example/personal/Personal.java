package org.example.personal;

public abstract class Personal {
    protected String name;
    protected int birthYear;

    public Personal(String name, int birthYear) {
        this.name = name;
        this.birthYear = birthYear;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return String.format("Сотрудник: %s, %s, %d", this.getType(), name, birthYear);
    }
}
