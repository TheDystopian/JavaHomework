package snus.bebra.anonimus.two.circle;


import java.util.*;

public class Tester {
    public static void main(String[] args){
        int length = 5;
        Random random = new Random();

        List <Circle> circles = new ArrayList<Circle>();

        for (int i = 0; i < length; i++)
            circles.add(
                    new Circle(
                            random.nextDouble(500.0),
                            random.nextDouble(500.0),
                            random.nextDouble(50.0)
                    )
            );

        for (Circle c: circles)
            System.out.println(c);
    }
}
