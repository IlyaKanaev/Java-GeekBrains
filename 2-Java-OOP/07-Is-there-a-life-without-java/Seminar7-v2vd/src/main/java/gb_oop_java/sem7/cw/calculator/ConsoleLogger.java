package gb_oop_java.sem7.cw.calculator;

public class ConsoleLogger implements Logable {
    @Override
    public void log(String message) {
        System.out.println(" LOG :  " + message);
    }
}
