import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        Animal cat = new Animal("Барсик", LocalDate.of(2020, 3, 20), new Illness("Лишай"));
        System.out.println(cat.getName());
        new Animal();
        cat.setIllness(new Illness(null));
        System.out.println(cat.getIllness());
        Animal dog = new Dog("Персик", LocalDate.of(2020, 2, 10), new Illness("Лишай"));
        System.out.println(dog.illness);
        List<Animal> list = new ArrayList();
        list.add(dog);
        list.add(cat);
        list.add(new Bird("Ласточка", LocalDate.of(2020, 3, 20), new Illness("Лишай"), 2));
        System.out.println(list);
        dog.lifeCycle();
        Animal duck = new Duck();
        duck.toGo();
        duck.fly();
        duck.swim();
        Animal eagle = new Eagle();
        eagle.toGo();
        eagle.fly();
        eagle.swim(); // орлы не плавают!
        Animal wanda = new Guppy();
        wanda.toGo();
        wanda.swim();
        wanda.fly(); // гуппи не летают!
        Animal falcon = new Falcon();
        falcon.toGo();
        falcon.swim(); // соколы не плавают
        falcon.fly();
    }
}
