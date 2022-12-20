package snus.bebra.anonimus.four.one.ten;

public class Plane extends Transport {
    Plane () {}

    Plane (double speed, double destination) {
        super(speed, 100, 300, destination);
    }

    Plane (double speed, double fuelPrice, double destination) {
        super(speed, fuelPrice, 300, destination);
    }

    Plane (double speed, double fuelPrice, double fuelConsumption, double destination) {
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
