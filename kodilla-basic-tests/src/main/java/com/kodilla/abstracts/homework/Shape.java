package com.kodilla.abstracts.homework;

public abstract class Shape {
    private double Area;
    private double Perimeter;

    public Shape() {   //konstruktor
        this.Area = 0;
        this.Perimeter = 0;
    }

    public double getArea() {
        return Area;
    }

    public double getPerimeter() {
        return Perimeter;
    }

}
