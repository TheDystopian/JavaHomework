package snus.bebra.anonimus.five.two;

import snus.bebra.anonimus.five.two.shapes.Ellipse;
import snus.bebra.anonimus.five.two.shapes.Rectangle;
import snus.bebra.anonimus.five.two.shapes.Shape;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;

public class UI extends JPanel {
    private final Random random = new Random();
    private final int GENERATED_SHAPES = 1000;

    private final ArrayList<Shape> shapes = new ArrayList<>();

    private void addShapes() {
        for (int i = 0; i < this.GENERATED_SHAPES; i++) {
            Shape shape = null;

            switch (random.nextInt(2)) {
                case 0 -> shape = new Ellipse();
                case 1 -> shape = new Rectangle();
            }

            shapes.add(shape);
        }
    }

    public void randomizeShapes() {
        for (Shape s: this.shapes) {
            s.setSize(new Dimension(
                random.nextInt(20, 200),
                random.nextInt(20, 200)
            ));

            s.setColor(new Color(
                random.nextInt(256),
                random.nextInt(256),
                random.nextInt(256)
            ));

        }


    }

    public void placeShapes() {
        for (Shape s: this.shapes) {
            this.add(s.getShape());
        }
    }

    public void generateShapes() {
        this.addShapes();
        this.randomizeShapes();
        this.placeShapes();
    }

    public void generateBackground() {
        this.setBackground(new Color(
            random.nextInt(256),
            random.nextInt(256),
            random.nextInt(256)
        ));
    }

    public void generate() {
        this.generateBackground();
        this.generateShapes();
    }





}
