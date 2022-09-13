package snus.bebra.anonimus.two.book;

public class Book {
    private String author;
    private String name;
    private int year;

    Book (String author, String name, int year) {
        this.author = author;
        this.name = name;
        this.year = year;
    }



    public String getName() {
        return name;
    }

    public int getYear() {
        return year;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", year=" + year +
                '}';
    }
}
