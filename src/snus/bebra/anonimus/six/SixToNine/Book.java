package snus.bebra.anonimus.six.SixToNine;

public class Book implements Printable {
    String name;
    String author;
    int creationDate;

    public void print() {
        System.out.println(
            "\"" + name + "\"" +
            "Автор: " + author +
            "Год создания: " + creationDate
        );

    }

}
