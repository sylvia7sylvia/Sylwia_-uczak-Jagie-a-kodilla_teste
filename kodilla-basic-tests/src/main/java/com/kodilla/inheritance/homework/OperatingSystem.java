package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private final int year;

    public OperatingSystem(int year) {
        this.year = year;

    }

    public void turnOn() {
        System.out.println("System ON");
    }

    public void turnOff() {
        System.out.println("System OFF");
    }

    public int getYear() {   //getter
        return year;
    }

    public void displayYear() {
        System.out.println("Year of production of the system " + year);
    }

}
