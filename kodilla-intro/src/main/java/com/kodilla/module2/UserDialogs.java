package com.kodilla.module2;

import java.util.Scanner;

public class UserDialogs {
    public static String getUserName(){
        Scanner scanner = new Scanner (System.in);   //tworzymy klasę Scanner, ktora zbiera dane wejsciowe z klawiatury
        while (true) {     //pętla nieskońćzona while, bedzie działać tak długo aż nie zostanie spełniony warunek - imie z 2 lub więcej liter
            System.out.println("Enter your name:");
            String name = scanner.nextLine().trim();   //wprowadzany dane z klawiatury, metoda trim (klasy String) usuwa spacje z początku i końca i zwraca tekst (String)
            if (name.length() >= 2) {
                return name;
            }
            System.out.println("Name is too short. Tray again");
        }
    }
}
