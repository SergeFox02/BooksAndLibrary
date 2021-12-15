package ru.homework8;

public class Library {

    private final Book[] books;

    public Library(int length) {
        this.books = new Book[length];
        for (int i = 0; i < this.books.length; i++) {
            this.books[i] = null;
        }
    }

    public void setBook(Book book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                return;
            }
        }
        System.out.println("В библиотеке нет места!");
    }

    public void printBooks() {
        for (int i = 0; i < this.books.length; i++)
            if (this.books[i] != null) {
                this.books[i].print();
            }
    }

    public void setPublisherYear(String nameBook, int publisherYear) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].getName() == nameBook) {
                this.books[i].setPublisherYear(publisherYear);
            }
        }
    }

}
