package snus.bebra.anonimus.three.SubTask1;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        Random random = new Random();

        double[] array = new double[5];

        for (int i = 0; i < array.length; i++)
            array[i] = random.nextDouble();

        for (double i: array)
            System.out.print(i + " ");

    }

}
