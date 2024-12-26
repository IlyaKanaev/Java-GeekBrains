package main.java.vetclinic.animals.impl;

import main.java.vetclinic.animals.Animal;
import main.java.vetclinic.animals.Swimable;
import main.java.vetclinic.animals.Walkable;
import main.java.vetclinic.illnesses.Illness;

import java.time.LocalDate;

public class Snake extends Animal implements Walkable, Swimable {

    static {
        animalIdx = 1;
    }

    public Snake(String name, Illness illness, LocalDate birthday) {
        super(name, illness, birthday);
    }

    public Snake(String name) {
        this(name, new Illness("Osteochondrosis"), LocalDate.of(2000, 6, 13));
    }

    public Snake() {
        this(String.format("Snake_#%d", animalIdx++));
    }

    @Override
    public double swim() {
        return 3D;
    }

    @Override
    public double run() {
        return 2D;
    }
}
