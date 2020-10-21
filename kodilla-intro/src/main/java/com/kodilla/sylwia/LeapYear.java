package com.kodilla.sylwia;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean yearDiv4 = year % 4 == 0;
        boolean yearDiv100 = year % 100 == 0;
        boolean yearDiv400 = year % 400 == 0;

        if (yearDiv4) {
            // prawda dla yearDiv4
            if (yearDiv100) {
                // prawda dla yearDiv100
                if (yearDiv400) {
                    // prawda dla yearDiv400
                    System.out.println("Rok " + year + " jest przestępny");
                } else {
                    // nie prawda dla yearDiv400
                    System.out.println("Rok " + year + " nie jest przestępny");
                }
            } else {
                // nie prawda dla yearDiv100
                System.out.println("Rok " + year + " jest przestępny");
            }
        } else {
            // nie prawda dla yearDiv4
            System.out.println("Rok " + year + " nie jest przestępny");
        }
    }
}