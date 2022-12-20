package snus.bebra.anonimus.five.two.shapes;

import javax.swing.*;
import java.awt.*;

public interface Shape {
    void setColor(Color color);
    void setSize(Dimension dimension);
    JComponent getShape();
}
