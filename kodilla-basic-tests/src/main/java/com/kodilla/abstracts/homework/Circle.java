package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    public double radius;
    private static final double PI;
    static {
        PI = 3.1415927;
    }

    public Circle(double PI, double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return PI * this.radius * this.radius;
    }

    public double getPerimeter() {
         return  2 * PI * this.radius;
    }
    public double getRadius() {
        return this.radius;
    }
}
