package snus.bebra.anonimus.eight;

import java.util.Scanner;

public class Eleven {
    public static int findOnes(String seq) {
        if (seq.length() == 0 || seq.startsWith("00")) return 0;

        return (seq.charAt(0) == '1' ? 1 : 0) + findOnes(seq.substring(1));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextLine()) {
            System.out.println("Введите последовательность");
        } // Too lazy to write printLn :P

        String seq = in.nextLine();

        System.out.println(findOnes(seq));
    }
}
