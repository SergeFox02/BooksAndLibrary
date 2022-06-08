package ru.homework8;

import java.util.Objects;

public class Book {

    private final Author author;
    private final String title;
    private int publisherYear;

    public Book(Author author, String name, int publisherYear) {
        this.author = author;
        this.title = name;
        this.publisherYear = publisherYear;
    }

    public Book(Author author, String name) {
        this(author, name, 0);
    }

    public Author getAuthor() {
        return this.author;
    }

    public String getName() {
        return this.title;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public void print() {
        System.out.println(author.getFirstName() + " " + author.getLastName() + ": " + this.title + ": " + this.publisherYear);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return author.equals(book.author) && title.equals(book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "Книга: " + author + ": " + title + ": " + publisherYear;
    }
}
