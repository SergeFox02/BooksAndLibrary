package ru.homework8;

public class Library {

    private final Book[] books;

    public Library(int length) {
        this.books = new Book[length];
    }

    public boolean addBook(Book book) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] == null) {
                this.books[i] = book;
                return true;
            }
        }
        System.out.println("В библиотеке нет места!");
        return false;
    }

    public void printBooks() {
        for (int i = 0; i < this.books.length; i++)
            if (this.books[i] != null) {
                this.books[i].print();
            }
    }

    public void setPublisherYear(String nameBook, int publisherYear) {
        for (int i = 0; i < this.books.length; i++) {
            if (this.books[i] != null && this.books[i].getName().equals(nameBook)) {
                this.books[i].setPublisherYear(publisherYear);
            }
        }
    }

}
