package com.kodilla.collections.adv.immutable.special.homework;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.createBook("PI razy drzwi", "Mickaël Launay");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("Droga do rzeczywistości", "Roger Penrose");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("Najgłupszy anioł", "Christopher Moore");
        System.out.println(bookManager.getBooks().size());

        System.out.println("-----------------------------");
        System.out.println("Dodajemy dwie książki");
        Book book1 = bookManager.createBook("PI razy drzwi", "Mickaël Launay");
        Book book2 = bookManager.createBook("PI razy okno", "Mickaël Launay");

        System.out.println("-----------------------------");
        System.out.println("Porównujemy metodą book1.equals(book2) ");

        if (book1.equals(book2)) {
            System.out.println("Tytuł i autor zgadzają się");
        } else {
            System.out.println("Tytuł i/lub autor się nie zgadzają");
        }

        System.out.println("-----------------------------");
        System.out.println("Porównujemy metodą book1 == book2 ");

        if (book1 == book2) {
            System.out.println("Tytuł i/lub autor zgadzają się");
        } else {
            System.out.println("Tytuł i autor się nie zgadzają");
        }

    }
}
