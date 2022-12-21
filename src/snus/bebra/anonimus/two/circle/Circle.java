package snus.bebra.anonimus.two.circle;

public class Circle {
    private double radius = 0.0;
    private Point point;

    Circle() {
        this.point = new Point();
    }
    Circle(double x, double y){
        this.point = new Point(x, y);
    }
    Circle(double x, double y, double r){
        this.point = new Point(x, y);
        this.radius = r;
    }

    public double getRadius(){
        return radius;
    }

    public void setRadius(){
        this.radius = radius;
    }

    public void setPoint(double x, double y) {
        this.point.SetXY(x, y);
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public String toString() {
        return String.format("Circle{radius=%f, Point=%s}", radius, point);
    }

}
