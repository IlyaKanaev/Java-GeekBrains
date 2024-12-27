package gb_oop_java.sem7.cw.calculator;

public class LogCalculableFactory implements ICalculableFactory {
    private Logable logable;

    public LogCalculableFactory(Logable logable) {
        this.logable = logable;
    }

    @Override
    public Calculable create(int primaryArg) {
        return new LogCalculator(logable, new Calculator(primaryArg));
    }

}
