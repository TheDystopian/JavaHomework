package snus.bebra.anonimus.four.one.ten;

public class Boat extends Transport{
    Boat () {}

    Boat (double speed, double destination) {
        super(speed, 100, 150, destination);
    }

    Boat (double speed, double fuelPrice, double destination) {
        super(speed, fuelPrice, 150, destination);
    }

    Boat (double speed, double fuelPrice, double fuelConsumption, double destination) {
        super(speed, fuelPrice, fuelConsumption, destination);
    }

    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public double getTime() {
        return super.getTime();
    }
}
