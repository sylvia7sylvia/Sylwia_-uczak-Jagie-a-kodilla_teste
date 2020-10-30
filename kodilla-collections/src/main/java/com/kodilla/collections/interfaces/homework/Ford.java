package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Ford{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ford ford = (Ford) o;
        return speed == ford.speed &&
                enginePower == ford.enginePower &&
                breaksPower == ford.breaksPower &&
                maxSpeed == ford.maxSpeed &&
                Objects.equals(name, ford.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, enginePower, breaksPower, maxSpeed);
    }
}
