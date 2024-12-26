package main.java.vetclinic.animals.impl;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.animals.Swimable;
import main.java.vetclinic.illnesses.Illness;

import java.time.LocalDate;

public class Fish extends Animal implements Swimable {

    static {
        animalIdx = 1;
    }

    public Fish(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Fish(String name) {
        this(name, new Illness("Sclerosis"), LocalDate.of(2000, 6, 13));
    }

    public Fish() {
        this(String.format("Fish_#%d", animalIdx++));
    }

    @Override
    public double swim() {
        return 6D;
    }
}
