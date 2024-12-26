import java.time.LocalDate;

public class Bird extends Animal {
    private int wingQuantity;

    public Bird(String name, LocalDate birthDay, Illness illness, int wingQuantity) {
        super(name, birthDay, illness);
        this.wingQuantity = wingQuantity;
    }
}
