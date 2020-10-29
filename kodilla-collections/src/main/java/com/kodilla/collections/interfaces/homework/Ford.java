package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    public String name;
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Ford (int speed, int enginePower, int breaksPower) {
        this.name = "Ford";
        this.speed = speed;
        this.enginePower = enginePower;
        this.breaksPower = breaksPower;
        this.maxSpeed = 180;
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
