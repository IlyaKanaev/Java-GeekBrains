package gb_oop_java.sem3.cw.fruits;

public enum Fruits {
    APPLE ("Яблоко"),
    ORANGE ("Апельсин"),
    PINEAPPLE,
    BANANA,
    PEAR;

    private  String name;


    Fruits(String name) {
        this.name = name;
    }

    Fruits() {
    }

    public String getName() {
        return name;
    }
}
