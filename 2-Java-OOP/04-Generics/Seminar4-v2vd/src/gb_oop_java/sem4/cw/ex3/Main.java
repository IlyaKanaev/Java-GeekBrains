package gb_oop_java.sem4.cw.ex3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Calculator calc1 = new Calculator();
        System.out.println(calc1.sumCollection(Arrays.asList(1,3,5,6)));
        System.out.println(calc1.sumCollection(Arrays.asList(1.2,3.5,5,6)));
    }
}
