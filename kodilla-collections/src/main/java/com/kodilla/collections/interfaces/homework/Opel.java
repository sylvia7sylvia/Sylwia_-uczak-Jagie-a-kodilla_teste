package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    public String name;
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Opel () {
        this.speed = 0;
        this.enginePower = 4;
        this.breaksPower = 3;
        this.maxSpeed = 170;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increaseSpeed() {
        this.speed += this.enginePower;
        if (this.speed > maxSpeed) {
            this.speed = maxSpeed;
        }
    }

    @Override
    public void decreaseSpeed() {
        this.speed -= this.breaksPower;
        if (this.speed < 0) {
            this.speed = 0;
        }
    }
}