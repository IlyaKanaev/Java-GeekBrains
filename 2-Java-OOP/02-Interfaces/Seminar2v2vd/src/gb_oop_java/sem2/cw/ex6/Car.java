package gb_oop_java.sem2.cw.ex6;

public class Car implements Transportable {
    @Override
    public void run(){
        System.out.println("Едем на машине");
    }
    @Override
    public void stop(){
        System.out.println("стоим на машине");
    }
}
