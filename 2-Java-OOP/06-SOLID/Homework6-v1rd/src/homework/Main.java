package homework;

public class Main{
    public static void main(String[] args){
        Man man = new User("Bob");
        Reporter reporter = new ReporterToScreen();
        reporter.report(man);
        Saver saver = new SaverToScreen();
        saver.save(man);
    }
}
