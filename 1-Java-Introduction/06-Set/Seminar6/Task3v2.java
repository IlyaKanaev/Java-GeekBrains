/*Продумайте структуру класса Кот
Какие поля и методы будут актуальны дляприложения, которое являетсяа) информационной системой ветеринарной клиникиб) архивом выставки котовв) информационной системой Театра кошек Ю. Д. КуклачёваМожно записать в текстовом виде, не обязательно реализовывать в java.
Реализуйте 1 из вариантов класса Cat из предыдущего задания, можноиспользовать не все придуманные поля и методы. Создайте несколькоэкземпляров этого класса, выведите их в консоль.
Добейтесь того, чтобы при выводе в консоль объекта типа Cat, выводилас
 */
class Cat {
    private int id;
    private String name;
    private int age;
    private String color;

    public Cat (int id, String name, int age, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public int getAge () {
        return age;
    }

    public String getColor () {
        return color;
    }

    public void setId (int id) {
        this.id = id;
    }

    public void setName (String name) {
        this.name = name;
    }

    public void setAge (int age) {
        this.age = age;
    }

    public void setColor (String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        //return String.format("ID: %d, Кличка: %s, Возраст: %d, Окрас: %s", id, name, age, color);
        return ("ID: " + id + ", Кличка: " + name + ", Возраст: " + age + ", Окрас: " + color);
    }
}
public class Task3v2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(100, "Мурзик", 3, "Белый");
        Cat cat2 = new Cat(101, "Васька", 5, "Рыжий");
        Cat cat3 = new Cat(102, "Мурка", 2, "Серый");
        System.out.println(cat1);
        System.out.println(cat2);
        System.out.println(cat3);
    }
}