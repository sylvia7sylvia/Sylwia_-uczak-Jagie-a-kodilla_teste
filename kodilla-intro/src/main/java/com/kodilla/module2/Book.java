package com.kodilla.module2;

import java.util.Scanner;  //importuje klasę Scanner

public class Book {
    //w klasie Book wywołujemy metodę main
    // zadeklarowane zmienne typu String (tekstowe), są prywatne żeby ich nie zmieniac
    private final String author;
    private final String title;

    private Book(String author, String title) {
        //konstruktor Book w klasie Book
        this.author = author;
        //ten obiekt i jego wlasciwosc
        this.title = title;
    }

    public static void main(String[] args) {
        //w metodzie main wywołuje metodę of
        String w = Book.getInput("Enter name of book author:");
        String z = Book.getInput("Enter book title:");

        Book book = Book.of(w, z);
        //obiekt klasy Book o właściwościach w i z
        System.out.println(book.author + " - " + book.title);
    }

    private static Book of(String author, String title) {
        //w metodzie of wywołuje konstruktor Book i tworze nowy (new) obiekt klasy Book
        return new Book(author, title);
    }

    public static String getInput(String line) {
        //w metodzie getInput scaner zczytuje autora i tytuł
        Scanner scanner = new Scanner(System.in);
        System.out.println(line);
        String result = scanner.nextLine().trim();
        return result;
    }

}
