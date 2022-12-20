package snus.bebra.anonimus.six.one;

public class Test {
    public static void main(String[] args) {
        Movable movable = new MovablePoint(5,5, 5, 5);
        System.out.println(movable);
        movable.moveDown();
        System.out.println(movable);
        movable.moveUp();
        System.out.println(movable);
        movable.moveLeft();
        System.out.println(movable);
        movable.moveRight();
        System.out.println(movable);

        movable = new MovableCircle(5,10, 10, 10, 10);

        System.out.println(movable);
        movable.moveDown();
        System.out.println(movable);
        movable.moveUp();
        System.out.println(movable);
        movable.moveLeft();
        System.out.println(movable);
        movable.moveRight();
        System.out.println(movable);
    }
}
