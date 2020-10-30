package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Kia implements Car {
    public String name;
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Kia (int speed, int enginePower, int breaksPower) {
        this.name = "Kia";
        this.speed = speed;
        this.enginePower = enginePower;
        this.breaksPower = breaksPower;
        this.maxSpeed = 150;
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
        return "Kia{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Kia kia = (Kia) o;
        return speed == kia.speed &&
                enginePower == kia.enginePower &&
                breaksPower == kia.breaksPower &&
                maxSpeed == kia.maxSpeed &&
                Objects.equals(name, kia.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, enginePower, breaksPower, maxSpeed);
    }
}

