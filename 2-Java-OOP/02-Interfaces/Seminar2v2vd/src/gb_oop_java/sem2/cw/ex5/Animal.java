package gb_oop_java.sem2.cw.ex5;

public abstract class Animal {
    //Создать классы Собака, Кот,Домашний Кот, Тигр, Животное
//Животные могут бежать и плыть. В качестве аргумента каждому методу передается длина препятствия.
//У каждого животного есть ограничения на действия (бег: кот — 200 м, собака — 500 м; плавание: кот — не умеет плавать, собака — 10 м). Результатом выполнения действия будет печать в консоль.
//Например: dogBobik.run(150); -> 'Бобик пробежал 150 м'.
//Создать один массив с животными и заставить их по очереди пробежать дистанцию и проплыть.
//Добавить подсчет созданных Домашних Котов, Тигров, Собак, Животных.
    public static int count;
    protected String name;
    protected Integer age;
    protected int maxRunDistance;
    protected int maxSwimDistance;

    public Animal(String name, Integer age, int maxRunDistance, int maxSwimDistance) {
        this.name = name;
        this.age = age;
        this.maxRunDistance = maxRunDistance;
        this.maxSwimDistance = maxSwimDistance;
        count++;
    }

    protected void run(int distance){
        if (distance < maxRunDistance){
            System.out.println(name + " пробежал " + distance + " метров.");
        } else {
            System.out.println(name + " не пробежал " + distance + " метров.");
        }
    }

    protected abstract void swim(int distance);
}
