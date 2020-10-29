package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

public class CarUtils {
    public static void describeCar(Car car) {
        System.out.println("------------------------------------------");
        System.out.println("A car: " + getCarName(car));
        System.out.println("Have a speed " + car.getSpeed() + " km/h");

    }

    private static String getCarName(Car car) {
        if (car instanceof Ford)
            return "Ford";
        else if (car instanceof Kia)
            return "Kia";
        else if (car instanceof Opel)
            return "Opel";
        else if (car instanceof Fiat)
            return "Fiat";
        else
            return "Unknown car";

    }

}
