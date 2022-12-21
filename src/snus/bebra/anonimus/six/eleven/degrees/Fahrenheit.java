package snus.bebra.anonimus.six.eleven.degrees;

public class Fahrenheit implements Convertable {
    private double degrees;

    public double getDegrees() {
        return 1.8 * (degrees - 273.15) - 32;
    }
    public double getDegreesRaw() {
        return degrees;
    }
    public void setDegrees(double degrees) {
        this.degrees = (degrees - 32) * 5/9 + 273.15;
    }
    public static double convert(Convertable convertable)  {
        return (convertable.getDegreesRaw() - 273.15) * 1.8 + 32;
    }
}
