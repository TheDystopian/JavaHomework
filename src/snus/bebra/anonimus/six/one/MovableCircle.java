package snus.bebra.anonimus.six.one;

import java.util.StringJoiner;

public class MovableCircle extends MovablePoint implements Movable {
    private final int radius;

    MovableCircle(int radius, int x, int y, int xSpeed, int ySpeed) {
        super(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "MovableCircle{" +
            "radius=" + radius +
            "} " + super.toString();
    }
}
