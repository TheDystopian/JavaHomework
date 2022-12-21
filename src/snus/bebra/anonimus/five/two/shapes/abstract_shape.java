package snus.bebra.anonimus.five.two.shapes;

import javax.swing.*;
import java.awt.*;

abstract public class abstract_shape {
    private Dimension size;
    private Color color;

    public void setSize(Dimension dimension) {
        this.size = dimension;
    }
    public void setColor(Color color) {
        this.color = color;
    }

    protected Dimension getSize() {
        return size;
    }

    protected Color getColor() {
        return color;
    }

    public JComponent getShape() {return null;}

}
