package com.kodilla.collections.adv.immutable.special.homework;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books = new ArrayList<>();

    public Book createBook(String title, String author) {
        System.out.println("Ksiązka: " + title);
        Book book = new Book(title, author);
        if (!exists(book)) {
            books.add(book);
        }
        return book;
    }
    private boolean exists(Book book) {
        return books.contains(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
