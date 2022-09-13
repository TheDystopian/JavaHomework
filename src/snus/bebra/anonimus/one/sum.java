package snus.bebra.anonimus.one;
import java.util.*;

public class sum {
    public static int sum (int[] nums){
        int sum = 0;
        for (int i = 0; i < nums.length; i++)
            sum += nums[i];
        return sum;
    }

    public static void main(String[] args) {
        int[] numbers = new int[10];
        Scanner intInput = new Scanner(System.in);

        for (int i = 0 ; intInput.hasNextInt() && i < numbers.length; i++)
            numbers[i] = intInput.nextInt();

        int sum = sum(numbers);

        System.out.printf("Сумма введенных чисел - %d\nСреднее арифметическое - %f", sum, (double) sum/numbers.length);
    }
}
