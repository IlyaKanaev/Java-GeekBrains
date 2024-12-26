package gb_oop_java.sem2.cw.ex5;

public class HomeCat extends Cat{
    public static int count;

    public HomeCat(String name, Integer age) {
        super(name, age);
        count++;
    }
}
