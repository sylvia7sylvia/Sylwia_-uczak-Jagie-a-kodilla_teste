package com.kodilla.collections.adv.immutable.homework;

import com.kodilla.collections.adv.immutable.Book;

import java.util.ArrayList;
import java.util.List;

public class BookManager {
    private List<Book> books = new ArrayList<>();

    public void createBook(String title, String author) {
        System.out.println("createBook: " + title);
        Book book = new Book(title, author);
        if (!exists(book)) {
            books.add(book);
        }
    }

    private boolean exists(Book book) {
        return books.contains(book);
    }

    public List<Book> getBooks() {
        return books;
    }
}
