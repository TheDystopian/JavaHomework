package snus.bebra.anonimus.two.book;

import java.util.ArrayList;
import java.util.Arrays;

public class BookTest {
    public static void main(String[] args) {
        BookCase bookcase = new BookCase(new ArrayList<>(
                Arrays.asList(
                    new Book("Bebrus Anonumus", "Snus", 1337),
                    new Book("Adam Smasher", "24 Hours", 2077),
                    new Book("???", "Unknown", 69)
                )
        ));

        System.out.println(bookcase);
        System.out.println(bookcase.getLatestBook());
        System.out.println(bookcase.getEarliestBook());
        bookcase.orderByDate();
        System.out.println(bookcase);

    }
}
