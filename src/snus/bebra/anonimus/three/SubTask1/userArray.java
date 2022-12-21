package snus.bebra.anonimus.three.SubTask1;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class userArray {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner input = new Scanner(System.in);

        int n = -1;
        while (n <= 0) {
            do
                System.out.println("Введите число n");
            while (!input.hasNextInt());
            n = input.nextInt();
        }

        int[] nArr = new int[n];

        for (int i = 0; i < nArr.length; i++) {
            nArr[i] = random.nextInt(0, n+1);
            System.out.print(nArr[i] + " ");
        }
        System.out.println();

        List <Integer> nEvenArr = new ArrayList<>();

        for (int i : nArr)
            if (i % 2 == 0)
                nEvenArr.add(i);

        for (int i: nEvenArr)
            System.out.print(i + " ");
    }
}
