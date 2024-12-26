package main.java.vetclinic.animals.impl;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.animals.Walkable;
import main.java.vetclinic.illnesses.Illness;

import java.time.LocalDate;

public class Cat extends Animal implements Walkable {

    static {
        animalIdx = 1;
    }

    public Cat(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Cat(String name) {
        this(name, new Illness("Fleas"), LocalDate.of(2021, 12, 1));
    }

    public Cat() {
        this(String.format("Cat_#%d", animalIdx++));
    }

    @Override
    public double run() {
        return 7;
    }
}
