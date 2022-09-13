package snus.bebra.anonimus.one;
import java.util.*;

public class row {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        do {
            System.out.print("Введите длину гармонического ряда ");
        } while (!input.hasNextInt());

        int length = input.nextInt();

        for (int i = 1; i <= length; i++)
            System.out.printf("%.3f ", (double) 1/i);
    }
}
