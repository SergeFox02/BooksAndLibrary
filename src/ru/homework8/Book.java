package ru.homework8;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) && name.equals(book.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, name);
    }

    @Override
    public String toString() {
        return "Книга: " + this.author.getFirstName() + " " + this.author.getLastName() + ": " + name + ": " + publisherYear;
    }
}
