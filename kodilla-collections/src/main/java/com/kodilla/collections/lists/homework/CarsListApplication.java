package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.*;

import java.util.LinkedList;
import java.util.List;

public class CarsListApplication {
    public static void main(String[] args) {
        List<Car> cars = new LinkedList<>();
        Ford ford = new Ford(60, 5, 4);
        cars.add(ford);
        cars.add(new Ford(150, 5, 4));
        cars.add(new Ford(160, 5, 4));
        cars.add(new Ford(170, 5, 4));
        cars.add(new Ford(180, 5, 4));
        cars.add(new Fiat(120, 4, 3));
        cars.add(new Fiat(110, 4, 3));
        cars.add(new Fiat(100, 4, 3));
        cars.add(new Opel(140, 7, 5));
        cars.add(new Opel(145, 7, 5));
        cars.add(new Opel(135, 7, 5));
        cars.add(new Kia(155, 6, 5));
        cars.add(new Kia(165, 6, 5));
        cars.add(new Kia(175, 6, 5));


        System.out.println("----------------------------------");
        System.out.println("Moja kolekcja aut to " + cars.size() + " sztuk");
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }

        cars.remove(3);

        cars.remove(ford);

        Kia kiaToRemove = new Kia(185, 6, 5);
        cars.remove(kiaToRemove);

        System.out.println("-------------------");
        System.out.println("Po dodaniu jednego i zezłomowaniu trzech aut kolekcja liczy: " + cars.size() + " sztuk");

        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
        System.out.println("-------------------");
        System.out.println("Teraz mamy: " + cars.size() + " sztuk aut w kolekcji");
    }
}

