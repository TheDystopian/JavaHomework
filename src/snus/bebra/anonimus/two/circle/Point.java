package snus.bebra.anonimus.two.circle;

public class Point {
    private double x = 0.0, y = 0.0;

    Point(double x, double y){
        this.SetXY(x, y);
    }

    Point(){}

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    public void SetXY(double x, double y){
        this.x = x;
        this.y = y;
    }
    public void move(double xDisp, double yDisp) {
        this.x += xDisp;
        this.y += yDisp;
    }


    public String toString() {
        return String.format("Point{X=%f, Y=%f}", x, y);
    }
}
