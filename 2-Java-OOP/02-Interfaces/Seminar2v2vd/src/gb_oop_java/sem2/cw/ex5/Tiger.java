package gb_oop_java.sem2.cw.ex5;

public class Tiger extends Cat {
    public static int count;

    public Tiger(String name, Integer age) {
        super(name, age);
        count++;
    }
}
