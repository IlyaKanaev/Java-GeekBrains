import java.util.HashMap;
import java.util.Map;

public class Calculator {
    //т.к. static блоки кода обрабатываются в первую очередь
//пропишем HashMap где значениями будут функции
    static Map<Character, Calculable> map = new HashMap<>();
    static {
//arr - это массив аргументов, соответствует args в calculate
        map.put('+', arr -> arr[0] + arr[1]);
        map.put('-', arr -> arr[0] - arr[1]);
        map.put('*', arr -> arr[0] * arr[1]);
//позже легко добавлять новые операции
//даже автоматически добавлять!
        map.put('/', arr -> arr[0] / arr[1]);
        map.put('s', arr -> Math.sqrt(arr[0]));
    }

    public static void main(String ... args) {
//        System.out.println(calculate(1, 2, '/'));
        System.out.println(calculateWithMap(9, 2, 's'));
    }
    //этот новый метод по ключу в map выполняет лямбда-функцию
    public static double calculateWithMap(double a, double b, char op) {
        return map.get(op).calculate(a, b);
    }

    public static double calculate(double a, double b, char op) {
        return switch (op) {
//в новом switch/case brake уже не обязателен
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> throw new UnsupportedOperationException("Not implemented");
//такой способ плох тем, что при добавлении новых операций
//придется увеличивать количество case и сложность кода
        };
    }
}
//функциональный интерфейс с абстрактным методом
// с бесконечным количеством принимаемых аргументов
interface Calculable {
    double calculate(double ... args);
}