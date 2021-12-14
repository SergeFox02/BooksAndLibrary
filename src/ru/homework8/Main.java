package ru.homework8;

public class Main {

    public static void main(String[] args) {

        Author tolstoi = new Author("Lev", "Tolstoi");
        Author dostoevskii = new Author("Fedor", "Dostoevsky");

        Book[] books = new Book[5];

        Book warAndPeace = new Book(tolstoi, "War and Peace");
        Book idiot = new Book(dostoevskii, "Idiot", 1868);

        System.out.println("warAndPeace.getPublisherYear() = " + warAndPeace.getPublisherYear());
        warAndPeace.setPublisherYear(1869);

        setBook(books, warAndPeace);
        setBook(books, warAndPeace);
        setBook(books, idiot);
        printBooks(books);

    }

    public static void setBook(Book[] books, Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                return;
            }
        }
        System.out.println("В библиотеке нет места!");
    }

    public static void printBooks(Book[] books) {
        for (int i = 0; i < books.length; i++)
            if (books[i] != null) {
                books[i].print();
            }
    }

}
