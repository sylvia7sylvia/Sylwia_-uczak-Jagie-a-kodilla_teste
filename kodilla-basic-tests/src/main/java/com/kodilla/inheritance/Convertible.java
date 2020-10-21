package com.kodilla.inheritance;

public class Convertible extends Car {
    public Convertible(int wheels, int seats) {    //konstruktor
        super (4, 2);  //ta intrukcja zawsze na pierwszym miejscu konstruktora
        System.out.println("Convertible constructor");
    }

    public void openRoof() {
        System.out.println("Opening roof...");
    }

    public void closeRoof() {
        System.out.println("Closing roof...");
    }

    @Override    //nadpisywanie metody
    //kompilator sprawdzi, czy prawidłowo nadpisaliśmy metodę (literówki),
    // czy typ zwracany, modyfikator dostępu, lista argumentów są kompatybilne
    // z metodą o tej samej nazwie w nadklasie.
    public void openDoors() {
        System.out.println("Opening 2 doors");
    }
}