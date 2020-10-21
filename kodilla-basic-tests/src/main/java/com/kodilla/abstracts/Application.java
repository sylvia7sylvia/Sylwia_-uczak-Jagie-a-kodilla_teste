package com.kodilla.abstracts;

public class Application {

    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal duck = new Duck();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);
    }
}
