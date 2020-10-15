package com.kodilla.module2;

public class Students {
    public static void main(String[] args) {
        Grades studentA = new Grades();
        studentA.add(5);
        studentA.add(5);
        studentA.add(5);
        studentA.add(2);
        studentA.add(5);
        System.out.println("Ostatnia dodana ocena to " + studentA.last());
        System.out.println("Srednia ocen to " + studentA.srednia());
    }
}
