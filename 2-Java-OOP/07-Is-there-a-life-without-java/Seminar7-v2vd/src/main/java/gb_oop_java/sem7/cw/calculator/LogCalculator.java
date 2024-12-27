package gb_oop_java.sem7.cw.calculator;

public class LogCalculator implements Calculable {
    private Logable logable;
    private Calculable decorated;

    public LogCalculator(Logable logable, Calculable decorated) {
        this.logable = logable;
        this.decorated = decorated;
    }

    @Override
    public Calculable sum(int arg) {
        logable.log("Сумма " + arg);
        return decorated.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        logable.log("Умножение " + arg);
        return decorated.multi(arg);
    }

    @Override
    public int getResult() {
        logable.log("Был вызван результат");
        return decorated.getResult();
    }
}
