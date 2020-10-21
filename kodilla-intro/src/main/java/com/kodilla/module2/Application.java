package com.kodilla.module2;

public class Application {

    public static void main(String[] args) {
        Person adam = new Person("Adam", 40.5, 178);
        Person ewa = new Person("Ewa", 28.5, 158);
        Person kain = new Person("Kain", 15.5, 168);
        Person abel = new Person("Abel", 12.5, 140);

        Person[] humans = {adam, ewa, kain, abel};

        for (int i = 0; i < humans.length; i++) {
            if (humans[i].age > 30 && humans[i].height > 160) {
                System.out.println(humans[i].name + " is older than 30 and higher than 160cm");
            } else {
                System.out.println(humans[i].name + " is 30 (or younger) or 160cm (or shorter)");
            }
        }
    }
}