package gb_oop_java.sem2.cw.ex1;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("qwe", "asd", 21);
        //па полям
//        cat.name = "Тиша";
//        cat.color = "Black";
//        cat.age = 21;
        //инкапсулировали
//        cat.setName("Тиша");
//        cat.setColor("Black");
//        cat.setAge(31);
//        System.out.println("cat = " + cat);
//        cat.jump();
//        cat.voice();
//        cat.animalInfo();
//        Animal animal = new Animal() {
//            @Override
//            void animalInfo() {
//                System.out.println("asd");
//            }
//        };
//        System.out.println(animal.getClass().getName());
//        Animal dog = new Dog("Пес");
        Animal[] animMas = {
                new Cat("Vasya", "red", 3),
                new Dog("Бобик"),
                new Cat("Рыжик", "синий", 12)
        };
//        for (Animal element : animMas) {
//            element.animalInfo();
//        }
        cat.clubok();
        for (Animal element : animMas) {
            if (element instanceof Cat){
                ((Cat) element).clubok();
            }
            else {
                System.out.println(element.getName() + " не умеет сворачиваться");
            }
        }
    }
}
