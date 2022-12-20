package snus.bebra.anonimus.seven.three;

public interface Movable {
    int getX();
    int getY();
    int getXSpeed();
    int getYSpeed();
    void setX(int x);
    void setY(int y);
    void setXSpeed(int XSpeed);
    void setYSpeed(int YSpeed);
    double getSpeed();
    boolean isEqualSpeed(Movable movable);

}
