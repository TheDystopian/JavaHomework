package snus.bebra.anonimus.eight;

import java.util.Scanner;

public class Ten {
    public static int reverseInt(int num) {
        int biggestElem = (int) Math.pow(10, Math.floor(Math.log10(num)));

        if (biggestElem < 10) return num;

        return num / biggestElem + reverseInt(num % biggestElem) * 10;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextInt()) {
            System.out.println("Введите число");
        }
        int num = in.nextInt();

        System.out.println(reverseInt(num));




    }
}
