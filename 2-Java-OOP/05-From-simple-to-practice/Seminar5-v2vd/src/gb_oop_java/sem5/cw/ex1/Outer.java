package gb_oop_java.sem5.cw.ex1;

public class Outer {
    //если сделать static class Inner, то получится вложенный клас, который может существовать без объектов внешнего класса. Так же вложеннй класс не имеет доступа к полям и методом внешнего
    class Inner {
        int innerValue;

        public Inner(int innerValue) {
            this.innerValue = innerValue;
        }

        public void innerMethod() {
            System.out.println(innerValue);
//            innerMethod(); todo:  закоментировал тк рекурсия
            System.out.println(outerValue);
            outerMethod();
            System.out.println("hello");
            //внутренний класс имеет доступ ко всем полям и методам внешнего класса
        }
    }

    int outerValue;

    public void outerMethod() {
        System.out.println(outerValue);
//        outerMethod(); todo:  закоментировал тк рекурсия
//        System.out.println(innerValue);
//        innerMethod();
        System.out.println("outer Hello");
        //внешний класс не имеет доступа ко всем полям и методам внутреннего класса
    }

    public static void main(String[] args) {
//        Inner inner = new Inner(); // внутренний класс не живет без внешнего -> так создать не получится
        Inner inn = new Outer().new Inner(10); // для исправления создаем сначала внешний

        //локальный (внутри метода)
        class Point {
            int x;
            int y ;

            public Point(int x, int y) {
                this.x = x;
                this.y = y;
            }

            @Override
            public String toString() {
                return "x=" + x +
                        ", y=" + y +
                        '}';
            }
        }
        Point p = new Point(2,4);
        System.out.println("p = " + p);
        Flyable flyable = new Flyable() {
            @Override
            public void flu() {
                System.out.println("Лечу!");
            }
        };
        // пишем  new Flyable()
        // org.example.z5.Outer$1 добавляется  под капотом implements Flyable
        // происходит оверайд методов (его видим)
        // создается объект  Outer flyable = new Outer();
        System.out.println(flyable.getClass().getName());
    }
}
