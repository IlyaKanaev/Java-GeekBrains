package gb_oop_java.sem3.cw.fruits;

public class Main {
    public static void main(String[] args) {
//        Создать перечисление фруктов, сравнить их значение в switch case с различным выводом по каждому типу.
        Fruits fruits = Fruits.ORANGE;
        for (Fruits value : Fruits.values()) {
            System.out.println(value);
        }
        switch (fruits) {
            case APPLE:
                System.out.println("Этот фрукт - " + fruits.getName());
                break;
            case ORANGE:
                System.out.println("Этот фрукт - " + fruits.getName());
                break;
            default:
                System.out.println("Вы нашли неопознанный фрукт!");
        }
    }
}
