package gb_oop_java.sem7.cw.jobagency;

import java.util.Random;

public class Junior implements Observer {
    String name;

    public Junior(String name) {
        this.name = name;
    }

    @Override
    public void receiveOffer(String nameCompany, int salary) {
        if (new Random().nextBoolean()){
            System.out.println("Выхожу завтра!");
        } else {
            System.out.println("YНе выхожу");
        }
    }
}
