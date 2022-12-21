package snus.bebra.anonimus.six.eleven.degrees;

public class Celsius implements Convertable {
    private double degrees;

    public double getDegrees() {
        return degrees - 273.15;
    }

    public double getDegreesRaw() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees + 273.15;
    }

    public static double convert(Convertable convertable) {
        return convertable.getDegreesRaw() - 273.15;
    }

}
