package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public double getPerimeter() {
        return this.side * 4;
    }

    public double getSide() {
        return this.side;
    }
}
