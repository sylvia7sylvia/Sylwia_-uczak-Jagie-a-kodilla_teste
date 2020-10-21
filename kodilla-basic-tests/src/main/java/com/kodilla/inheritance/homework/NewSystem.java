package com.kodilla.inheritance.homework;

public class NewSystem extends OperatingSystem {

    public NewSystem(int year) {
        super(2016);
        System.out.println("New System");
    }

    public void turnOn() {
        System.out.println("System ON...");
    }

    public void turnOff() {
        System.out.println("System OFF");
    }

    public void displayYear() {
        System.out.println("System was product in " + getYear() + " year");
    }
}
