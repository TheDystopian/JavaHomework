package snus.bebra.anonimus.six.eleven.degrees;

public class Kelvin implements  Convertable{
    private double degrees;

    public double getDegrees() {
        return degrees;
    }
    public double getDegreesRaw() {
        return degrees;
    }

    public void setDegrees(double degrees) {
        this.degrees = degrees;
    }

    public static double convert(Convertable convertable)  {
        return convertable.getDegreesRaw();
    }
}
