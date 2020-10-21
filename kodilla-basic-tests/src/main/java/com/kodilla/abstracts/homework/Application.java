package com.kodilla.abstracts.homework;

public class Application {
    private static final double PI = 3.1415927;

    public static void main(String[] args) {

        Square square = new Square(5);
        System.out.println("Kwadrat o boku "+square.getSide()+" posiada pole "+square.getArea()+" oraz obwod "+square.getPerimeter());

        Circle circle = new Circle(PI, 3);
        System.out.println("Koło o promieniu "+circle.getRadius()+" posiada pole "+circle.getArea()+" oraz obwod "+circle.getPerimeter());

        Triangle triangle = new Triangle(5, 6);
        System.out.println("Trójkąt o podstawie "+triangle.getSide()+ " oraz wysokości "+triangle.getHeight()+" posiada pole "+triangle.getArea()+" oraz obwod "+triangle.getPerimeter());
    }
}
