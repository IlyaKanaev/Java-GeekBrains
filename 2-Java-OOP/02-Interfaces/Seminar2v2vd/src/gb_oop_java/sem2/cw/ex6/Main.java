package gb_oop_java.sem2.cw.ex6;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human();
//        Car car = new Car();
//        human.drive(car);
//        human.stop(car);
        Human human = new Human();
        Transportable car = new Car();
        human.drive(car);
        human.drive(car);
        human.stop(car);
        Transportable byc = new Byc();
        human.drive(byc);
    }
}
