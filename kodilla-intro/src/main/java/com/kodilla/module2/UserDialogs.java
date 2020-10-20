package com.kodilla.module2;

import java.util.Scanner;

public class UserDialogs {
    public static String getUserName() {
        Scanner scanner = new Scanner(System.in);   //tworzymy klasę Scanner, ktora zbiera dane wejsciowe z klawiatury
        while (true) {     //pętla nieskończona while, bedzie działać tak długo aż nie zostanie spełniony warunek - imie z 2 lub więcej liter
            System.out.println("Enter your name:");
            String name = scanner.nextLine().trim();   //wprowadzany dane z klawiatury, metoda trim (klasy String) usuwa spacje z początku i końca i zwraca tekst (String)
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Tray again");
        }
    }

    public static String getUserSelection() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "A":
                    return "ADD";
                case "S":
                    return "SUB";
                case "D":
                    return "DIV";
                case "M":
                    return "MUL";
                default:
                    System.out.println("Wrong calculation. Try again.");
            }
        }
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        int val = scanner.nextInt();
        return val;
    }
}
//    public static String getUserSelection() {
//        Scanner scanner = new Scanner(System.in);
//        while (true) {
//            System.out.println("Select calculation (A-add, S-subtract, D-divide, M-multiply):");
//            String calc = scanner.nextLine().trim().toUpperCase();         // [1]
//            if (calc.equals("A")) {                                        // [2]
//                return "ADD";                                               // [3]
//            } else if (calc.equals("S")) {                                 // [4]
//                return "SUB";                                               // [5]
//            } else if (calc.equals("D")) {                                 // [6]
//                return "DIV";                                               // [7]
//            } else if (calc.equals("M")) {                                 // [8]
//                return "MUL";                                               // [9]
//            }                                                              // [10]
//            System.out.println("Wrong calculation. Try again.");
//        }
//    }
