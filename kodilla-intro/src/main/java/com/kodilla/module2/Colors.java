package com.kodilla.module2;

import java.util.Scanner;

public class Colors {
    enum ColorsName {
        B,  /* biały */
        C, /* czerwony */
        F,  /* fioletowy */
        K,  /* koralowy */
        M,  /* magenta */
        P, /* purpura */
        R,  /* różowy */
        Z,  /* zielony */
    }

    public static void main(String[] args) {
        try {
            ColorsName Colors = ColorsName.valueOf(getFirstLetterOfColor());

            switch (Colors) {
                case B -> System.out.println("biały");
                case C -> System.out.println("czerwony");
                case F -> System.out.println("fioletowy");
                case K -> System.out.println("koralowy");
                case M -> System.out.println("magenta");
                case P -> System.out.println("purpura");
                case R -> System.out.println("różowy");
                case Z -> System.out.println("zielony");
                default -> System.out.println("Żaden kolor nie zaczyna się na ta literkę.");
            }
        } catch (Exception e) {
            System.out.println("Żaden kolor nie zaczyna się na ta literkę."); //wyjątek - złapanie wyjątku
        }
    }

    public static String getFirstLetterOfColor() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Podaj pierwszą literę koloru:");
        char c = sc.next().charAt(0);
        return Character.toString(Character.toUpperCase(c));  //zmienia małą na dużą literę

    }
}
