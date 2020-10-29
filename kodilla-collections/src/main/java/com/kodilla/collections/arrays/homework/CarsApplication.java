package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {
        Random random = new Random();
        Car[] cars = new Car[random.nextInt(15)];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);
    }

    public static Car drawCar() {
        Random random = new Random();
        int drawnCar = random.nextInt(4);
        int speed = random.nextInt(150);
        int enginePower = random.nextInt(20);
        int breakPower = random.nextInt(10);

        if (drawnCar == 0)
            return new Ford(speed, enginePower, breakPower);
        else if (drawnCar == 1)
            return new Fiat(speed, enginePower, breakPower);
        else if (drawnCar == 2)
            return new Kia(speed, enginePower, breakPower);
        else
            return new Opel(speed, enginePower, breakPower);

    }

}
