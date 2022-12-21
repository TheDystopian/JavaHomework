package snus.bebra.anonimus.three.SubClass3.CurrencyConverter;

import java.util.Scanner;

public class currencyConverterTest {
    public static void main(String[] args) {
        currencyConverter currencyConverter = new currencyConverter();
        Scanner input = new Scanner(System.in);


        int curr1 = -1, curr2 = -1;
        while (curr1 < 0 || curr1 > currencyConverter.size()) {
            do
                System.out.println("Из какой валюты конвертировать\n" + currencyConverter);
            while (!input.hasNextInt());

            curr1 = input.nextInt() - 1;
        }

        while (curr2 < 0 || curr2 > currencyConverter.size()) {
            do
                System.out.println("В какую валюту конвертировать\n" + currencyConverter);
            while (!input.hasNextInt());

            curr2 = input.nextInt() - 1;
        }

        do
            System.out.println("Введите количество вылюты");
        while (!input.hasNextDouble());

        double amount = input.nextDouble();
        System.out.printf(
                "%n%.2f %s -> %.2f %s",
                amount,
                currencyConverter.getCurrency(curr1),
                currencyConverter.translateCurrency(amount, curr1, curr2),
                currencyConverter.getCurrency(curr2)
        );
    }
}
