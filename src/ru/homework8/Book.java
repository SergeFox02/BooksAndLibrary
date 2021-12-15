package ru.homework8;

public class Book {

    private final Author author;
    private final String name;
    private int publisherYear;

    public Book(Author author, String name, int publisherYear) {
        this.author = author;
        this.name = name;
        this.publisherYear = publisherYear;
    }

    public Book(Author author, String name) {
        this(author, name, 0);
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.name;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public void print() {
            System.out.println(author.getFirstName() + " " + author.getLastName() + ": " + this.name + ": " + this.publisherYear);
    }
}
