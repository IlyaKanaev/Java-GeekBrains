package org.example.animals;

import org.example.Illness;
import org.example.interfaces.Flyable;
import org.example.interfaces.Goable;

public class Parrot extends Animal implements Goable, Flyable {

    public Parrot(String name) {
        super.name = name;
    }

    public Parrot(String name, Illness illness, int birthYear) {
        super.name = name;
        super.illness = illness;
        super.birthYear = birthYear;
    }

    @Override
    public double run() {
        return 2;
    }

    @Override
    public double fly() {
        return 30;
    }
}
