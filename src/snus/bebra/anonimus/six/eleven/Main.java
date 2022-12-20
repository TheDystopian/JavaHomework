package snus.bebra.anonimus.six.eleven;

import snus.bebra.anonimus.six.eleven.degrees.Celsius;
import snus.bebra.anonimus.six.eleven.degrees.Convertable;
import snus.bebra.anonimus.six.eleven.degrees.Fahrenheit;
import snus.bebra.anonimus.six.eleven.degrees.Kelvin;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Convertable degrees = null;

        while (degrees == null) {
            System.out.println("Выберите изначальную единицу измерения\n" +
                "1. Кельвин\n" +
                "2. Цельсий\n" +
                "3. Фаренгейт");

            if (!input.hasNextInt()) {
                input.nextLine();
                continue;
            }

            switch (input.nextInt()) {
                case 1 -> degrees = new Kelvin();
                case 2 -> degrees = new Celsius();
                case 3 -> degrees = new Fahrenheit();

                default -> System.out.println("Неправильный ввод");
            }
        }

        while (true) {
            System.out.println("Введите количество градусов");

            if (input.hasNextDouble()) {
                degrees.setDegrees(input.nextDouble());
                break;
            }

            input.nextLine();
        }

        while (true) {
            System.out.println("Выберите единицу измерения для конвертации\n" +
                "1. Кельвин\n" +
                "2. Цельсий\n" +
                "3. Фаренгейт");

            if (!input.hasNextInt()) {
                input.nextLine();
                continue;
            }

            switch (input.nextInt()) {
                case 1 -> System.out.printf("%.2f%n", Kelvin.convert(degrees));
                case 2 -> System.out.printf("%.2f%n", Celsius.convert(degrees));
                case 3 -> System.out.printf("%.2f%n", Fahrenheit.convert(degrees));
                default -> System.out.println("Неправильный ввод");
            }
            break;
        }



    }



}
