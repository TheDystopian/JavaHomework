package snus.bebra.anonimus.two.howmany;

import java.util.Scanner;

public class HowMany {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);

        int counter = 0;
        while (input.nextLine() != ""){
            counter++;
            System.out.println(counter);
        }
    }
}
