package gb_oop_java.sem4.cw.ex2;

public class Main {
    public static void main(String[] args) {
        BoxWithNumber<Integer> box1 = new BoxWithNumber<>(new Integer[]{1,200,3,55});
        BoxWithNumber<Double> box2 = new BoxWithNumber<>(new Double[]{5.1,8.2,3.2,55.3});
        if (box1.compareAverage(box2)){
            System.out.println("box1 > box2");
        } else System.out.println("box1 < box2");
    }
}
