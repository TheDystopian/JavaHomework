package snus.bebra.anonimus.five.two.shapes;

import javax.swing.*;
import java.awt.*;

public class Rectangle extends abstract_shape implements Shape {
    @Override
    public JComponent getShape() {
        JComponent shape = new JComponent() {
            @Override
            protected void paintComponent(Graphics g) {
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(getColor());
                g2d.fillRect(
                        0, 0,
                        getSize().width,
                        getSize().height
                );
            }
        };
        shape.setPreferredSize(getSize());
        return shape;
    }
}
