package org.example.animals;

import org.example.interfaces.Goable;
import org.example.interfaces.Swimable;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String name) {
        super.name = name;
    }

    public Dog() {
    }

    @Override
    public double run() {
        return 10;
    }

    @Override
    public double swim() {
        return 2;
    }
}
