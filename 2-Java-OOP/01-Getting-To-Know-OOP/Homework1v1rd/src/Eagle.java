// орел
public class Eagle extends Animal{
    @Override
    public void swim() {
        System.out.println(this.getType() + " не умеет плавать");
    }
}