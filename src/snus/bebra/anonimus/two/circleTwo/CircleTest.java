package snus.bebra.anonimus.two.circleTwo;

public class CircleTest {
    public static void main(String[] args) {
        Circle circle1 = new Circle(3);
        Circle circle2 = new Circle(3);
        Circle circle3 = new Circle(4);

        System.out.println("Тест равенства - " + circle1.equals(circle2));
        System.out.println("Тест неравенства - " + circle1.equals(circle3));

        System.out.println("Тест > - " + circle1.more(circle3));
        System.out.println("Тест > - " + circle1.more(circle2));
        System.out.println("Тест > - " + circle3.more(circle1));

        System.out.println("Тест < - " + circle1.less(circle3));
        System.out.println("Тест < - " + circle2.less(circle1));
        System.out.println("Тест < - " + circle3.less(circle1));

    }
}
