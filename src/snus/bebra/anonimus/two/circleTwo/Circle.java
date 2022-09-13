package snus.bebra.anonimus.two.circleTwo;

public class Circle {
    private double radius;

    Circle (double radius) {
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(radius, 2);
    }

    public double getLength() {
        return 2 * Math.PI * radius;
    }

    public boolean equals(Circle compare) {
        return this.radius == compare.radius;
    }

    public boolean less(Circle compare) {
        return this.radius < compare.radius;
    }

    public boolean more(Circle compare) {
        return !(this.less(compare) || this.equals(compare));
    }



}
