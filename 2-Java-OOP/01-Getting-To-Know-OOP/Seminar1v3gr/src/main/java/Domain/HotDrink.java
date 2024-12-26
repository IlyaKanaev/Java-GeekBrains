package Domain;

// ДЗ создание класса горячие напитки
public class HotDrink extends Product{
    private float drinkVolume;
    private int temperature;

    public HotDrink(int price, int place, String name, long id, float drinkVolume, int temperature) {
        super(price, place, name, id);
        this.drinkVolume = drinkVolume;
        this.temperature = temperature;
    }
    @Override
    public String toString(){
        return super.toString() + "Volume = " +drinkVolume+ "\n"+
                "Temperature = " +temperature+ "\n";
    }

    public float getDrinkVolume() {
        return drinkVolume;
    }

    public void setDrinkVolume(float drinkVolume) {
        this.drinkVolume = drinkVolume;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }
}
