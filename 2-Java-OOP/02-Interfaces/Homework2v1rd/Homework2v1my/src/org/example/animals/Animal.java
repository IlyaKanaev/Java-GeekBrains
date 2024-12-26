package org.example.animals;

import org.example.Illness;

public class Animal {

    protected String name;
    protected int birthYear;
    protected Illness illness;


    public Animal(String name, Illness illness, int birthYear) {
        this.name = name;
        this.illness = illness;
        this.birthYear = birthYear;
    }

    public Animal(String name) {
        this(name, new Illness("без диагноза"), 2023);
    }

    public Animal() {
        this("кличка не известна", new Illness("без диагноза"), 2023);
    }

    //геттеры
    public String getName() {
        return this.name;
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return String.format("Животное: %s, %s, %d, %s", this.getType(), name, birthYear, illness.getTitle());
    }
}
