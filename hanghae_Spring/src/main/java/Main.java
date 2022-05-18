import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        String ID = UUID.randomUUID().toString();

        Bus bus1 = new Bus(10, ID, 10, 1200, true, 20, 10);
        bus1.driveStart();
        bus1.busRide(20);
        bus1.drivespeed(15);
        bus1. checknow();

        Bus bus2 = new Bus(11, ID, 10, 1200, true, 20, 10);
        bus2.driveStart();
        bus2.busRide(20);
        bus2.drivespeed(15);
        bus2.checknow();

        Taxi taxi1 = new Taxi(20, ID, 10, 1200, true, 10, 0);
        taxi1.driveStart();
        taxi1.pluscharge(5);
        taxi1.drivespeed(15);
        taxi1.checknow();

        Taxi taxi2 = new Taxi(20, ID, 10, 1200, true, 10, 3);
        taxi2.driveStart();
        taxi2.pluscharge(11);
        taxi2.drivespeed(15);
        taxi2.checknow();

    }
}
