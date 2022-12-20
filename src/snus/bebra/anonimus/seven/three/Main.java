package snus.bebra.anonimus.seven.three;

public class Main {
    public static void main(String[] args) {
        Dot dot = new Dot();
        Rectangle rectangle = new Rectangle();

        rectangle.setYSpeed(3);
        dot.setYSpeed(3);

        System.out.println(rectangle.isEqualSpeed(dot));
        dot.setYSpeed(4);
        System.out.println(rectangle.isEqualSpeed(dot));

    }
}
