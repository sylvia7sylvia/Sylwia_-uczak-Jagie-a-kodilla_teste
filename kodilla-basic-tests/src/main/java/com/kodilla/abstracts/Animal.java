package com.kodilla.abstracts;

public abstract class Animal {

    private int numberOfLegs;

    public Animal(int numberOfLegs) {   //konstruktor
        this.numberOfLegs = numberOfLegs;
    }

    public int getNumberOfLegs() {    //getter
        return numberOfLegs;
    }
    public abstract void giveVoice();   // metoda abstrakcyjna, nie ma ciała - czyli nic zawartego w {}
}