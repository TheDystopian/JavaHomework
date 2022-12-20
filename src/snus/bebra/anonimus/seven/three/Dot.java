package snus.bebra.anonimus.seven.three;

public class Dot implements Movable {
    private int x = 0, y = 0, XSpeed = 0, YSpeed = 0;

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getXSpeed() {
        return XSpeed;
    }

    public int getYSpeed() {
        return YSpeed;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void setXSpeed(int XSpeed) {
        this.XSpeed = XSpeed;
    }

    public void setYSpeed(int YSpeed) {
        this.YSpeed = YSpeed;
    }

    public double getSpeed() {
        return Math.sqrt(Math.pow(XSpeed, 2) + Math.pow(YSpeed, 2));
    }

    public boolean isEqualSpeed(Movable movable) {
        return this.getSpeed() == movable.getSpeed();
    }

}
