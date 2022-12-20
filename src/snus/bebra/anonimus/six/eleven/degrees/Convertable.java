package snus.bebra.anonimus.six.eleven.degrees;

public interface Convertable {
    double getDegrees();
    double getDegreesRaw();
    void setDegrees(double degrees);
    static double convert(Convertable convertable) {return 0.0;};

}
