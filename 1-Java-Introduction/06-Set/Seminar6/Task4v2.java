/*Создайте множество, в котором будут храниться экземпляры класса Cat - HashSet<Cat>.Поместите в него некоторое количество объектов.
Создайте 2 или более котов с одинаковыми параметрами в полях. Поместите их во множество.Убедитесь, что все они сохранились во множество.
Создайте метод public boolean equals(Object o)Пропишите в нём логику сравнения котов по параметрам, хранимым в полях. То есть, методдолжен возвращать true, только если значения во всех полях сравниваемых объектов равны.
Создайте метод public int hashCode()который будет возвращать hash, вычисленный на основе полей класса Cat. (Можно использоватьObjects.hash(...))
Выведите снова содержимое множества из пункта 2, убедитесь, что дубликаты удалились 
 */
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

class Cat {
    private int id;
    private String name;
    private int age;
    private String color;

    public Cat(int id, String name, int age, String color) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getColor() {
        return color;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {

        // return String.format("ID: %d, Кличка: %s, Возраст: %d, Окрас: %s", id, name,
        // age, color);
        return ("ID: " + id + ", Кличка: " + name + ", Возраст: " + age + ", Окрас: " + color);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Cat c = (Cat) obj;
        return id == c.id && name.equals(c.name) && age == c.age && color.equals(c.color);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, color, age);
    }
}


public class Task4v2 {
    public static void main(String[] args) {
        Cat cat1 = new Cat(100, "Мурзик", 3, "Белый");
        Cat cat2 = new Cat(101, "Васька", 5, "Рыжий");
        Cat cat3 = new Cat(102, "Мурка", 2, "Серый");

        Cat cat4 = new Cat(100, "Мурзик", 3, "Белый");
        Cat cat5 = new Cat(101, "Васька", 5, "Рыжий");
        Cat cat6 = new Cat(102, "Мурка", 2, "Серый");

        Set<Cat> clinicDB = new HashSet<>(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6));
        for (Cat cat : clinicDB) {
            System.out.println(cat);
        }
    }
}