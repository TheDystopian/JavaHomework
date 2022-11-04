package snus.bebra.anonimus.five.six;

import javax.swing.*;

public class Pelmen {
    public static void main(String[] args) {
        ImageIcon contents = new ImageIcon("imgs/0001-0250.gif");
        ImageIcon icon = new ImageIcon("imgs/0001.png");


        JLabel label = new JLabel(contents);
        JFrame window = new JFrame("Pelmen");

        window.setSize(1024,1024);
        window.setResizable(false);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);

        window.add(label);
        window.setIconImage(icon.getImage());
        window.setVisible(true);
    }
}
