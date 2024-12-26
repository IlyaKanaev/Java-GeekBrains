package gb_oop_java.sem2.cw.ex1;

public class Cat extends Animal{
    private String color;
    private int age;

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 30) {
            this.age = age;
        } else {
            System.out.println("Введен неверный возраст");
        }
    }

    @Override
    public String toString() {
        return "Cat{" +
                "color='" + color + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public void animalInfo(){
        System.out.println("Это кот с именем "+name
                +", с возрастом-"+age+ " , c цветом шерсти: "+color);
    }

    @Override
    public void voice() {
        System.out.println(" мявк ! мявк!");
    }

    @Override
    public void jump() {
        System.out.println("прыжек кота! ");
    }

    public void clubok() {System.out.println(name + " свернулся в клубок");}
}
