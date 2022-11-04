package snus.bebra.anonimus.four.one.ten;

public class Train extends Transport{
    Train () {}

    Train (double speed, double destination) {
        super(speed, 100, 250, destination);
    }

    Train (double speed, double fuelPrice, double destination) {
        super(speed, fuelPrice, 250, destination);
    }

    Train (double speed, double fuelPrice, double fuelConsumption, double destination) {
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
