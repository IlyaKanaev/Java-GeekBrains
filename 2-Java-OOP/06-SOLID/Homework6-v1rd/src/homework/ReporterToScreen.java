package homework;

public class ReporterToScreen implements Reporter {
    @Override
    public void report(Man man) {
        System.out.println("Report for user: " + man.name());
    }
}
