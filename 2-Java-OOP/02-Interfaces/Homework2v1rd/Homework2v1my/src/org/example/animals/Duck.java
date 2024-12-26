package org.example.animals;

import org.example.interfaces.Flyable;
import org.example.interfaces.Goable;
import org.example.interfaces.Swimable;

public class Duck extends Animal implements Flyable, Goable, Swimable {
    public Duck(String name) {
        super.name = name;
    }

    @Override
    public double swim() {
        return 5;
    }

    @Override
    public double run() {
        return 2;
    }

    @Override
    public double fly() {
        return 20;
    }
}