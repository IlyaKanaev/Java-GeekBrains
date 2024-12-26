package gb_oop_java.sem4.cw.ex1;

import java.net.Inet4Address;

public class Main {
    public static void main(String[] args) {
        SimpleBox sb1 = new SimpleBox(10);
        SimpleBox sb2 = new SimpleBox(20);
//        Integer res = sb1.getObject() + sb2.getObject();  Проблема каста.
        Integer res = (Integer)sb1.getObject() + (Integer)sb2.getObject();
        System.out.println("res = " + res);
//        sb1.setObject("Java test"); //Ошибка каста
//        Integer res2 = (Integer)sb1.getObject() + (Integer)sb2.getObject();
        if (sb1.getObject() instanceof Integer || sb2.getObject() instanceof Integer){
            Integer res2 = (Integer)sb1.getObject() + (Integer)sb2.getObject();
        }
        else System.out.println("Ошибка типов данных");

        GenBox<Integer> gen1 = new GenBox<>(10);
        GenBox<Integer> gen2 = new GenBox<>(30);
        int sum = gen2.getObj() + gen1.getObj();
        System.out.println("sum = " + sum);
    }
}
