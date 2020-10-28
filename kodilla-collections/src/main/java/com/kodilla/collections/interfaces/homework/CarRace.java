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

        Ford ford = new Ford();//TODO Review: declare as Car (repeat for all cars)
        ford.name = "Ford";//TODO Review: move to constructor (repeat for all cars)
        showCarSpeed(ford);
        doRace(ford);

        Opel opel = new Opel();
        opel.name = "Opel";
        showCarSpeed(opel);
        doRace(opel);

        Kia kia = new Kia();
        kia.name = "Kia";
        showCarSpeed(kia);
        doRace(kia);

        Fiat fiat = new Fiat();
        fiat.name = "Fiat";
        showCarSpeed(fiat);
        doRace(fiat);
    }
    private static void showCarSpeed (Car car) {
        System.out.println("Prędkość początkowa dla " + car.getName() + " to " + car.getSpeed());
    }
}
