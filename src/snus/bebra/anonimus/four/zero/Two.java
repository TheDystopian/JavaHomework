package snus.bebra.anonimus.four.zero;

import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Seasons season = null;

        while (season == null) {
            System.out.println("Ваше любимое время года?");

            String seasonIn = input.nextLine();

            switch (seasonIn) {
                case "Лето" -> season = Seasons.SUMMER;

                case "Осень" -> season = Seasons.SUMMER;

                case "Зима" -> season = Seasons.SUMMER;

                case "Весна" -> season = Seasons.SUMMER;

                default -> System.out.println("Неправильное время года");
            }
        }

        System.out.printf("Мое любимое время года - %s", season.getName());

    }
}
