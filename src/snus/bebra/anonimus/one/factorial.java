package snus.bebra.anonimus.one;

import java.util.*;

public class factorial {
    public static int fac(int fac){
        int factorial = 1;
        for (int i = 1; i <= fac; i++)
            factorial *= i;
        return factorial;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Факториал? ");
        } while (!input.hasNextInt());

        int factor = input.nextInt();

        System.out.printf("%d! = %d", factor, fac(factor));
    }
}
