package com.kodilla.module2;

public class Application {
    String name;
    double age;
    double height;

    //TODO: Pls move name, age and height to different class: eg. Person, and use Person in class Application
    public Application(String name, double age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public static void main(String[] args) {
        Application adam = new Application ("Adam", 40.5, 178);
        Application ewa = new Application ("Ewa", 28.5, 158);
        Application kain = new Application ("Kain", 15.5, 168);
        Application abel = new Application ("Abel", 12.5, 140);
        Application [] humans = {adam, ewa, kain, abel};

            for (int i = 0; i < humans.length; i++) {
                if (humans[i].age > 30 && humans[i].height > 160) {
                    System.out.println(humans[i].name + " is older than 30 and higher than 160cm");
                } else {
                    System.out.println(humans[i].name + " is 30 (or younger) or 160cm (or shorter)");
                }
    /*public static void main(String[] args) {
        String name = "Adam";
        double age = 40.5;
        double height = 178;

        if (name != null) {
            if (age > 30 && height > 160) {
                System.out.println("User is older than 30 and higher than 160cm");
            } else {
                System.out.println("User is 30 (or younger) or 160cm (or shorter)");
            }
        }
    } */
        }
    }
}