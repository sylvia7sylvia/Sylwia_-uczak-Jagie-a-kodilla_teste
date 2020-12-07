package com.kodilla.spring.basic.spring_configuration.homework;

import java.util.Random;

public class Sedan implements Car {
    boolean lightsOnOff;

    @Override
    public boolean hasHeadlightsOn() {
        return lightsOnOff;
    }

    @Override
    public boolean turnLightsOnOff() {
        Random random = new Random();
        int hour = random.nextInt(24);
        if (hour >= 6 && hour <=20) {
            lightsOnOff = false;
        } else {
            lightsOnOff = true;
        }
        return this.lightsOnOff;
    }
    @Override
    public String getCarType() {
        return "Sedan";
    }
}
