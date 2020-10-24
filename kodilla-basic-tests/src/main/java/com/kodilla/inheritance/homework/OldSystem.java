package com.kodilla.inheritance.homework;

public class OldSystem extends OperatingSystem {

    public OldSystem(int year) {
        super(1993);
        System.out.println("Old System");
    }
/*TODO NOT NEEDED
    public void turnOn() {
        System.out.println("System ON...");
    }

    public void turnOff() {
        System.out.println("System OFF");
    }

    public void displayYear() {
        System.out.println("System was product in " + getYear() + " year");
    }*/
}

