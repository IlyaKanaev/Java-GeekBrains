package gb_oop_java.sem2.cw.ex1;

public abstract class Animal {

    protected String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    abstract void animalInfo();

    public void voice() {
        System.out.println("Звук!");
    }

    public void jump() {
        System.out.println(" Прыжок ! ");
    }

    public String getName() {
        return name;
    }
}
