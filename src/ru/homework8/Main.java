package ru.homework8;

public class Main {

    public static void main(String[] args) {

        Author tolstoi = new Author("Lev", "Tolstoi");
        Author dostoevskii = new Author("Fedor", "Dostoevsky");

        Book warAndPeace = new Book(tolstoi, "War and Peace");
        Book idiot = new Book(dostoevskii, "Idiot", 1868);

        System.out.println("warAndPeace.getPublisherYear() = " + warAndPeace.getPublisherYear());
        warAndPeace.setPublisherYear(1869);

        Library myLibrary = new Library(6);

        myLibrary.setBook(warAndPeace);
        myLibrary.setBook(warAndPeace);
        myLibrary.setBook(idiot);
        myLibrary.setBook(idiot);

        myLibrary.printBooks();

        myLibrary.setPublisherYear("War and Peace", 1878);

        myLibrary.printBooks();

    }

}
