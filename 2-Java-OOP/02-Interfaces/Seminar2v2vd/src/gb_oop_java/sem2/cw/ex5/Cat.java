package gb_oop_java.sem2.cw.ex5;

public class Cat extends Animal {


    public Cat(String name, Integer age) {
        super(name, age, 200, 0);
    }
    @Override
    protected void swim(int distance) {
        System.out.println("Коты не умеют плавать");
    }

}
