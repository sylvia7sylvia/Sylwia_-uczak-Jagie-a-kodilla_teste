package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private double side;
    private double height;

    public Triangle(double side, double height) {
        this.side = side;
        this.height = height;
    }

    public double getArea() {
        return (this.side / 2) * this.height;
    }

    public double getPerimeter() {
        return this.side * 3;
    }

    public double getSide() {
        return this.side;
    }

    public double getHeight() {
        return this.height;
    }

}
