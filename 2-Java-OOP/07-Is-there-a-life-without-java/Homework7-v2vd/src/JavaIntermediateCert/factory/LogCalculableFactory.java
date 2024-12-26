package JavaIntermediateCert.factory;

import JavaIntermediateCert.logger.Logable;
import JavaIntermediateCert.model.Calculable;
import JavaIntermediateCert.model.ComplexCalculator;
import JavaIntermediateCert.model.ComplexNumber;
import JavaIntermediateCert.model.LogCalculator;


public class LogCalculableFactory implements ICalculableFactory{
    private Logable logable;

    @Override
    public Calculable create(ComplexNumber primaryArg) {
        return new LogCalculator(new ComplexCalculator(primaryArg), logable);
    }

    public LogCalculableFactory(Logable logable) {
        this.logable = logable;
    }
}
