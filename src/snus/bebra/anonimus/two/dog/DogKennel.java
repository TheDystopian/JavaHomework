package snus.bebra.anonimus.two.dog;

import java.util.*;

public class DogKennel {
    public static void main(String[] args) {
        List <Dog> dogs = new ArrayList<>();
        Scanner input = new Scanner(System.in);


        while (true) {
            System.out.println("Введите породу и возраст собаки");

            String breed = input.nextLine();
            if (!input.hasNextShort()) continue;
            short age = input.nextShort();

            Dog dog = new Dog(breed, age);
            dogs.add(dog);
            System.out.printf("Собаке %d лет в человеческих годах\n", dog.toHumanYears());

            System.out.println(dogs);




            input.nextLine();
        }
    }
}
