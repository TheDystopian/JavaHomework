package snus.bebra.anonimus.three.SubTask2;

public class Shell {
    public static void main(String[] args) {
        Double dvo = Double.valueOf(123.45);

        Double ds = Double.parseDouble("123.45");

        byte dtob = dvo.byteValue();
        double dtod = dvo.doubleValue();
        float dtof = dvo.floatValue();
        int dtoi = dvo.intValue();
        long dtol = dvo.longValue();
        short dtosh = dvo.shortValue();

        System.out.println(dvo);

        String d = Double.toString(ds);

        System.out.println(d);


    }
}
