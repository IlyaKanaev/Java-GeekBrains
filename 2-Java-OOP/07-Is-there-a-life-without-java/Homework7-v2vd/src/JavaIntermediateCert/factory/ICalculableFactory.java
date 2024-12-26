package JavaIntermediateCert.factory;

import JavaIntermediateCert.model.Calculable;
import JavaIntermediateCert.model.ComplexNumber;

public interface ICalculableFactory {
    Calculable create(ComplexNumber primaryArg);
}
