package ru.homework8;

public class Book {

    private final Author author;
    int publisherYear;

    public Book(Author author, int publisherYear) {
        this.author = author;
        this.publisherYear = publisherYear;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublisherYear() {
        return this.publisherYear;
    }

    public void setPublisherYear(int publisherYear) {
        this.publisherYear = publisherYear;
    }

    public void print() {
        System.out.println(author.getFirstName() + " " + author.getLastName() + " " + this.publisherYear);
    }
}
