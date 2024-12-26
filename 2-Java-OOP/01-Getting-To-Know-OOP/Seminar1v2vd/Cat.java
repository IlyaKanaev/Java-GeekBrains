package Seminar1v2;

public class Cat extends Animal{
    private String color;
    private Integer age;

    public Cat(String name, String color, Integer age) {
        super(name);
        this.color = color;
        this.age = age;
    }

    public Cat() {
    }

    public void setAge(Integer age) {
        if (age >= 0 && age < 15) {
            this.age = age;
        }
        else {
            System.out.println("Введен некорректный возвраст");
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getAge() {
        return age;
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
    protected void animalInfo() {
        System.out.println("Информация о коте: \n" +toString());
    }

    @Override
    protected void voice() {
        System.out.println("Кот кричит");
    }

    @Override
    protected void jump() {
        System.out.println("Кот прыгает");
    }
}