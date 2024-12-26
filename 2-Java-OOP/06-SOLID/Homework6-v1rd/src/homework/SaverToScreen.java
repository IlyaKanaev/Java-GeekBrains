package homework;

public class SaverToScreen implements Saver {
    @Override
    public void save(Man man){
        System.out.println("Save user: " + man.name());
    }
}
