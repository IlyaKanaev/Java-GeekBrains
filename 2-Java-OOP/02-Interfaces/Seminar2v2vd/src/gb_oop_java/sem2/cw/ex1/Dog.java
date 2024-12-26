package gb_oop_java.sem2.cw.ex1;

public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void animalInfo() {
        System.out.println("Это Сбака с именем "+name);
    }

    @Override
    public void voice() {

    }

    @Override
    public String toString() {
        return "Кличка собаки " + name + '\'';
    }
}
