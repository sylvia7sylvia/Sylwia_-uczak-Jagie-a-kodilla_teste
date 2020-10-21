package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * this.radius * this.radius;
    }

    public double getPerimeter() {
         return  2 * Math.PI * this.radius;
    }
    public double getRadius() {
        return this.radius;
    }
}
