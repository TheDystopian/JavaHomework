package snus.bebra.anonimus.four.one.eight;

public class Square extends Rectangle {
    private double side;
    Square() {}

    Square(double side) {
        super(side, side);
        this.side = side;
    }

    Square(double side, String color, boolean filled) {
        super(side, side, color, filled);
        this.side = side;
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        setWidth(side);
        setLength(side);
        this.side = side;
    }

    @Override
    public String toString() {
        return "Square{" +
            "side=" + side +
            "} " + super.toString();
    }
}
