package snus.bebra.anonimus.seven.four;

public interface MathCalculable {
    static double pi = Math.PI;

    static double power(double i, double power) {
        return Math.pow(i, power);
    }

    static double complexNum(double real, double imaginable) {
        return Math.sqrt(Math.pow(real, 2) + Math.pow(imaginable, 2));
    }


}
