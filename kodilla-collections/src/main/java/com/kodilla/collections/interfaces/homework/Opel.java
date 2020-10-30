package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Opel implements Car {
    public String name;
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Opel (int speed, int enginePower, int breaksPower) {
        this.name = "Opel";
        this.speed = speed;
        this.enginePower = enginePower;
        this.breaksPower = breaksPower;
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

    @Override
    public String toString() {
        return "Opel{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Opel opel = (Opel) o;
        return speed == opel.speed &&
                enginePower == opel.enginePower &&
                breaksPower == opel.breaksPower &&
                maxSpeed == opel.maxSpeed &&
                Objects.equals(name, opel.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, enginePower, breaksPower, maxSpeed);
    }
}
