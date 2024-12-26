package gb_oop_java.sem4.cw.ex3;

import java.util.List;

public class Calculator {
    public Double sumCollection (List<? extends Number> genList){
        double result = 0;
        for (Number number : genList) {
            result += number.doubleValue();
        }
        return result;
    }
}
