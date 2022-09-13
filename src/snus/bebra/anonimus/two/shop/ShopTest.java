package snus.bebra.anonimus.two.shop;

import java.util.Scanner;

public class ShopTest {



    public static void main(String[] args) {
        Shop shop = new Shop();
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("""
            Выберите действие
                1. Добавить компьютер            
                2. Удалить компьютер
                3. Найти компьютер
            """);

            if (!input.hasNextInt()) {
                input.nextLine();
                continue;
            }



            short action = input.nextShort();

            input.nextLine();

            System.out.println("Введите название компьютера");
            String computer = input.nextLine();


            switch (action) {
                case 1: {
                    shop.addComputer(computer);
                    break;
                }
                case 2: {
                    shop.deleteComputer(computer);
                    break;
                }
                case 3: {
                    System.out.println(shop.findComputer(computer));
                }
            }
        }
    }
}
