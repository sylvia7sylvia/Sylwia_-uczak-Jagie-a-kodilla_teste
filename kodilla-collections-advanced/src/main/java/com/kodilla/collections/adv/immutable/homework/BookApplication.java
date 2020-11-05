package com.kodilla.collections.adv.immutable.homework;

import com.kodilla.collections.adv.immutable.Book;

public class BookApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        bookManager.createBook("PI razy drzwi", "Mickaël Launay");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("PI razy drzwi", "Mickaël");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("PI", "Mickaël");
        System.out.println(bookManager.getBooks().size());
        bookManager.createBook("PI razy drzwi", "Mickaël Launay");
        System.out.println(bookManager.getBooks().size());


        Book b1 = new Book("PI razy drzwi", "Mickaël Launay");
        Book b2 = new Book("PI razy drzwi", "Mickaël Launay");
        System.out.println("Porównanie: " + (b1 == b2));

    }
}
