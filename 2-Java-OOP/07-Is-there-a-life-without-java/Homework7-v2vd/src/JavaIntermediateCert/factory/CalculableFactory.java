package JavaIntermediateCert.factory;

import JavaIntermediateCert.model.Calculable;
import JavaIntermediateCert.model.ComplexCalculator;
import JavaIntermediateCert.model.ComplexNumber;

public class CalculableFactory implements ICalculableFactory {
    public Calculable create(ComplexNumber primaryArg) {
        return new ComplexCalculator(primaryArg);
    }
}
