package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();

        System.out.println(car.getName() + " rozpędza się do " + car.getSpeed() + " km/h");
        System.out.println(" ");
    }

    public static void main(String[] args) {

        System.out.println("3 ... 2... 1... START!");
        System.out.println(" ");

        Car ford = new Ford(0,5,4);
        showCarSpeed(ford);
        doRace(ford);

        Car opel = new Opel(0, 7, 5);
        showCarSpeed(opel);
        doRace(opel);

        Car kia = new Kia(0, 6, 4);
        showCarSpeed(kia);
        doRace(kia);

        Car fiat = new Fiat(0, 4, 3);
        showCarSpeed(fiat);
        doRace(fiat);
    }

    private static void showCarSpeed(Car car) {
        System.out.println("Prędkość początkowa dla " + car.getName() + " to " + car.getSpeed());
    }
}
