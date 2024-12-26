//гуппи
public class Guppy extends Animal{
    @Override
    public void fly() {
        System.out.println(this.getType() + " не умеет летать");
    }
}
