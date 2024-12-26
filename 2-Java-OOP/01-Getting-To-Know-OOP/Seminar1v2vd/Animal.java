package Seminar1v2;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public Animal() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void animalInfo(){
        System.out.println("Имя животкого - " + name);
    }
    protected void voice(){
        System.out.println("Животное издает звук! ");
    }
    protected void jump(){
        System.out.println("Животное прыгает!");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }


}
