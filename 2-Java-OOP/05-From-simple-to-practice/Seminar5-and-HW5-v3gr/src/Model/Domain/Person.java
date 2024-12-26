package Model.Domain;

/**
 * Абстрактный базовый класс Person.
 * String name - поле абстрактного имени
 * int age - поле абстрактного возраста
 */

public abstract class Person {
    private String name;
    private int age;

    // Конструктор класса Person, принимает от пользователя имя и возраст
    // в начальном виде. Конструктор без перегрузок
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    //Методы геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Переопределение метода toString
    @Override
    public String toString(){
        StringBuilder personString = new StringBuilder();
        personString.append("\tname = ").append(this.name);
        if (name.length() <= 4){
            personString.append("\t");
        }
        personString.append("\t\t");
        personString.append("age = ").append(this.age);
        return personString.toString();

    }
}
