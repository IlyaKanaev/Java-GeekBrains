package gb_oop_java.sem2.cw.ex5;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Animal[] animals = {
                new HomeCat("Васька", 4),
                new Tiger("Патрон", 12),
                new Dog("Тузик", 11),
                new Dog("Беляш", 4)
        };
        for (Animal element : animals) {
            element.run(100 + new Random().nextInt(700));
            element.swim(1 + new Random().nextInt(20));
        }
    }
}
