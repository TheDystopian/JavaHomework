package snus.bebra.anonimus.four.one.ten;

abstract public class Transport {
    private double speed;
    private double fuelPrice;
    private double fuelConsumption;
    private double destination;


    Transport() {}
    Transport(double speed, double fuelPrice, double fuelConsumption, double destination) {
        this.speed = speed;
        this.fuelPrice = fuelPrice;
        this.fuelConsumption = fuelConsumption;
        this.destination = destination;
    }

    public double getTime() {
        return destination / speed;
    }

    public double getPrice() {
        return destination * fuelConsumption * fuelPrice;
    }

}
