package snus.bebra.anonimus.four.one.two;

import java.util.Random;

public class PhoneTest {

    public static <T> T randomElement (T[] array, Random random) {
        return array[random.nextInt(0, array.length)];
    }




    public static void main(String[] args) {
        final short size = 3;
        final String[] phoneNames = {"Apple", "Samsung", "Xiaomi", "Huawei", "OPPO", "VIVO", "OnePlus", "Realme"};

        Random random = new Random();

        Phone[] phones = new Phone[3];

        for (int i = 0; i < size; i++)
            phones[i] = new Phone(
                random.nextLong(100000000, 999999999),
                randomElement(phoneNames, random),
                random.nextInt(300, 600)
            );

        System.out.println(randomElement(phones, random).receiveCall("E"));


        for (Phone p: phones) {
            System.out.println(p);
            System.out.println(p.getNumber());
        }

        System.out.println(randomElement(phones, random).receiveCall("E", random.nextLong(100000000, 999999999)));

        System.out.println(randomElement(phones, random).sendMessage(
                Long.valueOf(random.nextLong(100000000, 999999999)),
                Long.valueOf(random.nextLong(100000000, 999999999)),
                Long.valueOf(random.nextLong(100000000, 999999999))
        ));


    }
}
