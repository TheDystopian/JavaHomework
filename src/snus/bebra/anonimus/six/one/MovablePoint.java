package snus.bebra.anonimus.six.one;

public class MovablePoint implements Movable {
    private int x, y;
    private final int xSpeed, ySpeed;

    MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public void moveUp() {
        this.y -= ySpeed;
    }

    public void moveDown() {
        this.y += ySpeed;
    }

    public void moveLeft() {
        this.x -= ySpeed;
    }

    public void moveRight() {
        this.x += ySpeed;
    }

    @Override
    public String toString() {
        return "MovablePoint{" +
            "x=" + x +
            ", y=" + y +
            ", xSpeed=" + xSpeed +
            ", ySpeed=" + ySpeed +
            '}';
    }
}
