package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double area;
    private double perimeter;

    public Shape() {   //konstruktor
        this.area = 0;
        this.perimeter = 0;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }

}
