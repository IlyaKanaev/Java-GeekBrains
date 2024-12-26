package Seminar1v2;

public class sem1 {
    public static void main(String[] args) {
//        1) Создать класс Cat с полями: имя,цвет,кол-во лет. Поработать с полями напрямую
//        2) Данному классу добавить инкапсуляцию + сделать валидацию на введенный возраст

        Cat cat1 = new Cat();
        cat1.setName("Васька");
        cat1.setColor("рыжий");
        cat1.setAge(3);
        System.out.println("Кот 1 по имени: " + cat1.getName()
                + "\nцвет -  " + cat1.getColor()
                + "\nвозраст " + cat1.getAge());
        Cat cat2 = new Cat("Рыжик", "черный", 4);
        System.out.println("Кот 2 по имени: " + cat2.getName()
                + "\nцвет -  " + cat2.getColor()
                + "\nвозраст " + cat2.getAge());
        System.out.println(cat1.toString());
        Animal animal = new Animal("Конь");
        animal.jump();
        animal.animalInfo();
        cat1.animalInfo();
        cat1.jump();
        cat1.voice();

//        Создайте класс, который описывает вектор (в трёхмерном пространстве).
        /*
        Vector vector1 = new Vector(1,1,5);
        Vector vector2 = new Vector(2,5,2);
        System.out.println("vector1: " + vector1);
        System.out.println("vector2: " + vector2);
        System.out.println("Длинна вектора vector1 = " + vector1.lenghtVector());
        System.out.println("Скалярное произведение vector1 и vector2 = " + vector1.scalar(vector2));
        System.out.println("Векторное произведение vector1 и vector2 = " + vector1.multiVector(vector2));
        System.out.println("Косинус между vector1 и vector2 = " + vector1.cos(vector2));

         */
    }
}
