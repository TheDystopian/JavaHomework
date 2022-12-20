package snus.bebra.anonimus.six.ten;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Shop shop = new Shop();


        while (true) {
            System.out.println("Выберите действие\n" +
                "1. Показать компьютеры\n" +
                "2. Добавить компьютер\n" +
                "3. Удалить компьютер"
            );

            if (!input.hasNextInt()) {
                input.nextLine();
                continue;
            }

            switch(input.nextInt()) {
                case 1 -> System.out.println(shop.listComputers());
                case 2 -> shop.newComputer();
                case 3 -> {
                    System.out.println("Введите номер копьютера для удаления");

                    if (!input.hasNextInt()) {
                        input.nextLine();
                        continue;
                    }

                    shop.deleteComputer(input.nextInt());
                }

                default -> System.out.println("Неправильное действие");
            }
        }

    }
}
