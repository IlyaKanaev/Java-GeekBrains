package JavaIntermediateCert;

import JavaIntermediateCert.factory.ICalculableFactory;
import JavaIntermediateCert.factory.LogCalculableFactory;
import JavaIntermediateCert.logger.ConsoleLogger;
import JavaIntermediateCert.view.ViewCalculator;

public class Main {
    public static void main(String[] args) {
        ICalculableFactory calculableFactory = new LogCalculableFactory(new ConsoleLogger());
        ViewCalculator view = new ViewCalculator(calculableFactory);
        view.run();
    }

}
