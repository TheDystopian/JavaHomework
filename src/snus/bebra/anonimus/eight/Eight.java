package snus.bebra.anonimus.eight;

import java.util.Scanner;

public class Eight {
    public static boolean findPallindrome(String pallindrome) {
        if (pallindrome.length() <= 1)
            return true;

        String sub = pallindrome.substring(1, pallindrome.length()-1);
        return findPallindrome(sub) && pallindrome.charAt(0) == pallindrome.charAt(pallindrome.length()-1);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        while (!in.hasNextLine()) {
            System.out.println("Введите паллиндром");
        }

        String pallindrome = in.nextLine();

        System.out.println(findPallindrome(pallindrome));
    }
}
