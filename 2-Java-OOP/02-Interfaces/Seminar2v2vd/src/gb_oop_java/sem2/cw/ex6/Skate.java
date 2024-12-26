package gb_oop_java.sem2.cw.ex6;

//public class Skate {
//    public void run() {
//        System.out.println("Едем на скейте");
//    }
//
//    public void stop() {
//        System.out.println("стоим на скейте");
//    }
//}

public class Skate implements Transportable {
    @Override
    public void run() {
        System.out.println("Едем на скейте");
    }
    @Override
    public void stop() {
        System.out.println("стоим на скейте");
    }
}
