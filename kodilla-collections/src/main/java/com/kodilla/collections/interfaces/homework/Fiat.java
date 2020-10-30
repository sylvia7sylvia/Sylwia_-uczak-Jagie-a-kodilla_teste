package com.kodilla.collections.interfaces.homework;

import java.util.Objects;

public class Fiat implements Car{
    public String name;
    private int speed;
    private final int enginePower;
    private final int breaksPower;
    private final int maxSpeed;

    public Fiat (int speed, int enginePower, int breaksPower) {
        this.name = "Fiat";
        this.speed = speed;
        this.enginePower = enginePower;
        this.breaksPower = breaksPower;
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

    @Override
    public String toString() {
        return "Fiat{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fiat fiat = (Fiat) o;
        return speed == fiat.speed &&
                enginePower == fiat.enginePower &&
                breaksPower == fiat.breaksPower &&
                maxSpeed == fiat.maxSpeed &&
                Objects.equals(name, fiat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, speed, enginePower, breaksPower, maxSpeed);
    }
}
