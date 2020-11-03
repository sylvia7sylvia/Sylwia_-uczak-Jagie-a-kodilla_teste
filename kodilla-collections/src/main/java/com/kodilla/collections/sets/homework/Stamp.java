package com.kodilla.collections.sets.homework;

import java.util.Objects;

public class Stamp {
    private String stampName;
    private String isStamped;
    private double height;
    private double width;

    public Stamp(String stampName, String isStamped, double height, double width) {
        this.stampName = stampName;
        this.isStamped = isStamped;
        this.height = height;
        this.width = height;
    }

    public String getStampName() {
        return stampName;

    }

    public String getIsStamped() {
        return isStamped;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stamp stamp = (Stamp) o;
        return Double.compare(stamp.height, height) == 0 &&
                Double.compare(stamp.width, width) == 0 &&
                Objects.equals(stampName, stamp.stampName) &&
                Objects.equals(isStamped, stamp.isStamped);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stampName, isStamped, height, width);
    }

    @Override
    public String toString() {
        return "Znaczek: " +
                "nazwa '" + stampName + '\'' +
                ", czy ostemplowany '" + isStamped + '\'' +
                ", wysokość=" + height +
                ", szerokość=" + width +
                ' ';
    }
}

