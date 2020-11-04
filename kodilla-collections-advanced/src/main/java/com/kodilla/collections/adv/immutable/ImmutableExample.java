package com.kodilla.collections.adv.immutable;

public class ImmutableExample {
    public static void main(String[] args) {
        Book book = new Book("Roger Penrose", "Droga do rzeczywistości");
        BookHacked bookHacked = (BookHacked) book;
        bookHacked.modifyTitle("Droga ...");

        System.out.println(book.getTitle());

    }
}
