package gb_oop_java.sem2.cw.ex5;

public class Dog extends Animal {
    public Dog(String name, Integer age) {
        super(name, age, 500, 10);
    }

    @Override
    protected void swim(int distance) {
        if (distance < maxRunDistance){
            System.out.println(name + " проплыл " + distance + " метров.");
        } else {
            System.out.println(name + " не проплыл " + distance + " метров.");
        }
    }
}
