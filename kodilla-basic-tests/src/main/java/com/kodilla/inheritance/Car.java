package com.kodilla.inheritance;

public class Car {
    private int wheels;
    private int seats;

    public Car(int wheels, int seats) {     //konstruktor
        this.wheels = wheels;
        this.seats = seats;
    }

    public void turnOnLights() {   //metoda włączania swiatła
        System.out.println("Lights were turned on");
    }

    public void openDoors() {   //metoda otwierania drzwi
        System.out.println("Opening 4 doors");
    }

    public int getWheels() {   //getter
        return wheels;
    }

    public int getSeats() {    //getter
        return seats;
    }
    public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
    }
}