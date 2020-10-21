package com.kodilla.inheritance.homework;

public class Application {

    public static void main(String[] args) {
        OperatingSystem system = new OperatingSystem(1993);
        system.turnOn();
        system.turnOff();

        OldSystem oldSystem = new OldSystem(1993);
        oldSystem.displayYear();

        NewSystem newSystem = new NewSystem(2016);
        newSystem.displayYear();

    }
}
