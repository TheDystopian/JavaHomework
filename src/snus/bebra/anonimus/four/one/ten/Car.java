package snus.bebra.anonimus.four.one.ten;

public class Car extends Transport{
    Car () {}

    Car (double speed, double destination) {
        super(speed, 30, 10, destination);
    }

    Car (double speed, double fuelPrice, double destination) {
        super(speed, fuelPrice, 10, destination);
    }

    Car (double speed, double fuelPrice, double fuelConsumption, double destination) {
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
