package com.kodilla.collections.interfaces.homework;

public class Fiat implements Car{
    public String name;
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Fiat () {
        this.speed = 0;
        this.enginePower = 3;
        this.breaksPower = 2;
        this.maxSpeed = 120;
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
