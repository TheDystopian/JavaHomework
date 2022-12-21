package snus.bebra.anonimus.one;
import java.util.*;

public class minmax {

    public static void main(String[] bebra){
        List <Integer> nums = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        while (input.hasNextInt())
            nums.add(input.nextInt());

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int num : nums){
            if (num < min) min = num;
            if (num > max) max = num;
        }

        System.out.printf("Наибольшее число - %d\nНаименьшее число - %d", max, min);

    }
}
