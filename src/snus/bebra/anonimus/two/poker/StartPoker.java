package snus.bebra.anonimus.two.poker;

import java.util.*;

public class StartPoker {
    public static void main(String[] args) {

        Poker poker = new Poker();

        Scanner input = new Scanner(System.in);
        do
            System.out.println("Введите количество игроков");
        while(!input.hasNextInt());


        int players = input.nextInt();

        for (int i = 0; i < players; i++)
            System.out.println(poker.getDeck());
    }


}
