package com.kodilla.module2;

import java.util.Scanner;

public class Book {      //w klasie Book wywołujemy metodę main

    private String author;
    private String title;

    private Book(String author, String title) {
        this.author = author;
        this.title = title;
    }

    @Override
    public String toString() {
        return this.author + " - " + this.title;
    }

    public static void main(String[] args) {   //w metodzie main wywołuje metodę of
        String w = Book.getInput("Enter name of book author:");
        String z = Book.getInput("Enter book title:");

        Book book = Book.of(w, z);
        System.out.println(book);
    }

    private static Book of(String author, String title) {  //w metodzie of wywołuje pywatną metodę Book (to jest konstruktor)
        return new Book(author, title);
    }

    public static String getInput(String line) {    //w metodzie getInput scaner zczytuje autora i tytuł
        Scanner scanner = new Scanner(System.in);
        System.out.println(line);
        String result = scanner.nextLine().trim();
        return result;
    }

}
