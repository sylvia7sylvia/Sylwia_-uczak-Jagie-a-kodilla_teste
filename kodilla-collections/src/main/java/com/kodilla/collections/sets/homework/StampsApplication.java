package com.kodilla.collections.sets.homework;

import java.util.HashSet;
import java.util.Set;

public class StampsApplication {
    public static void main(String[] args) {
        Set<Stamp> stamps = new HashSet<>();
        stamps.add(new Stamp("Motyl", "ostemplowany", 2.5, 2.0));
        stamps.add(new Stamp("Mapa Polski", "nie ostemplowany", 3.5, 3.0));
        stamps.add(new Stamp("Bociany", "ostemplowany", 2.5, 2.5));
        stamps.add(new Stamp("Motyl", "ostemplowany", 2.5, 2.0));


        System.out.println("Ilość znaczków w kolekcji: " + stamps.size());
        for (Stamp stamp : stamps)
            System.out.println(stamp);

    }
}
