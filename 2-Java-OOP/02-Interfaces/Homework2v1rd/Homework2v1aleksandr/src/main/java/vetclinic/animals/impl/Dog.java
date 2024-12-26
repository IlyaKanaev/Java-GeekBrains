package main.java.vetclinic.animals.impl;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.animals.Swimable;
import main.java.vetclinic.animals.Walkable;
import main.java.vetclinic.illnesses.Illness;

import java.time.LocalDate;

public class Dog extends Animal implements Walkable, Swimable {

    static {
        animalIdx = 1;
    }

    public Dog(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Dog(String name) {
        this(name, new Illness("Fleas"), LocalDate.of(2020, 1, 1));
    }

    public Dog() {
        this(String.format("Dog_#%d", animalIdx++));
    }

    @Override
    public double run() {
        return 5D;
    }

    @Override
    public double swim() {
        return 1D;
    }
}
