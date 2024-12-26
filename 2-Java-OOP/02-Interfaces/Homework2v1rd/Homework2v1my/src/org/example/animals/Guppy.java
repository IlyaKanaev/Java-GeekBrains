package org.example.animals;

import org.example.interfaces.Swimable;

//гуппи
public class Guppy extends Animal implements Swimable {
    public Guppy(String name) {
        super.name = name;
    }

    @Override
    public double swim() {
        return 10;
    }
}
