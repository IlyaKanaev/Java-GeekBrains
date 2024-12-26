import java.io.PrintStream;
import java.time.LocalDate;

public class Animal {
    protected String name;
    protected LocalDate birthDay;
    protected Illness illness;

    public Animal(String name, LocalDate birthDay, Illness illness) {
        this.name = name;
        this.birthDay = birthDay;
        this.illness = illness;
    }

    public Animal() {
        this("Вася", LocalDate.now(), new Illness("Болезнь"));
    }

    private void wakeUp() {
        System.out.println(this.getType() + " проснулся");
    }

    private void wakeUp(String time) {
        PrintStream var10000 = System.out;
        String var10001 = this.getType();
        var10000.println(var10001 + " проснулся в " + time);
    }

    private void hunt() {
        System.out.println(this.getType() + " охотится");
    }

    private void eat() {
        System.out.println(this.getType() + " кушает");
    }

    private void sleap() {
        System.out.println(this.getType() + " спит");
    }

    public void lifeCycle() {
        this.wakeUp();
        this.hunt();
        this.eat();
        this.sleap();
    }

    public void toGo() {
        System.out.println(this.getType() + " двигается");
    }

    public void fly() {
        System.out.println(this.getType() + " летает");
    }

    public void swim() {
        System.out.println(this.getType() + " плавает");
    }

    public void setIllness(Illness illness) {
        this.illness = illness;
    }

    public String getName() {
        return this.name;
    }

    public LocalDate getBirthDay() {
        return this.birthDay;
    }

    public Illness getIllness() {
        return this.illness;
    }

    public String getType() {
        return this.getClass().getSimpleName();
    }

    public String toString() {
        return String.format("name =%s, birthday =%s, illness =%s", this.name, this.birthDay, this.illness);
    }
}