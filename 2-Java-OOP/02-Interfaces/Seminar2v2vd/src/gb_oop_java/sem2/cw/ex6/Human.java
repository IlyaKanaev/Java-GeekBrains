package gb_oop_java.sem2.cw.ex6;

public class Human {
//        6) Создать класс человек с возможностью ездить и останавливаться на:
//        машине, скейтборде,велосипеде(что будет если расширить список ?).

//    private Car lastCar;
//    private Skate lastSkate;
//
//    public void drive(Car car) {
//        if (lastCar == null) {
//            car.run();
//            lastCar = car;
//        } else {
//            System.out.println("Уже еду");
//        }
//
//    }
//
//    public void stop(Car car) {
//        if (lastCar != null) {
//            car.stop();
//            lastCar = null;
//        } else {
//            System.out.println("Уже стою");
//        }
//    }
//
//    public void drive(Skate skate) {
//        skate.run();
//    }
//
//    public void stop(Skate skate) {
//        skate.stop();
//    }

    private Transportable lastTransport;

    public void drive(Transportable transport) {
        if (lastTransport == null) {
            transport.run();
            lastTransport = transport;
        } else {
            System.out.println("уже еду");
        }
    }


    public void stop(Transportable transport) {
        if (lastTransport != null) {
            transport.stop();
            lastTransport = null;
        } else {
            System.out.println("уже стою");
        }
    }

}

