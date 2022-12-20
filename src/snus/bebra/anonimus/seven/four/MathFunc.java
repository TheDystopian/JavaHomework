package snus.bebra.anonimus.seven.four;

public class MathFunc implements MathCalculable {
    double r;


    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double circleLength() {
        return pi * r * 2;
    }


    public static double circleLength(double r) {
        return pi * r * 2;
    }



}
