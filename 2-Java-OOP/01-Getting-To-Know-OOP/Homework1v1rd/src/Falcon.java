public class Falcon extends Animal{
    @Override
    public void swim() {
        System.out.println(this.getType() + " не умеет плавать");
    }
}
