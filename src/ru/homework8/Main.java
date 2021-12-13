package ru.homework8;

public class Main {

    public static void main(String[] args) {

        Author tolstoi = new Author("Lev", "Tolstoi");
        Author dostoevskii = new Author("Fedor", "Dostoevsky");

        tolstoi.print();
        dostoevskii.print();

        Book warAndPeace = new Book(tolstoi, 1865);
        Book idiot = new Book(dostoevskii, 1868);

        System.out.println("warAndPeace.getPublisherYear() = " + warAndPeace.getPublisherYear());

        warAndPeace.setPublisherYear(1869);

        warAndPeace.print();
        idiot.print();


    }
}
