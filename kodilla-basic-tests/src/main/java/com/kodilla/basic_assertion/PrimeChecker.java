package com.kodilla.basic_assertion;

import java.util.Scanner;

public class PrimeChecker {
    private int count;

    public static void main(String[] args) {
        int number;
        String s = "";
        number = getValue();
        if (!isPrime(number)) {
            s = " nie";
        }
        System.out.println("Liczba " + number + s + " jest liczbą pierwszą" );
    }

    public static int getValue() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        return scanner.nextInt();
    }

    public static boolean isPrime(int number) {

        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }

        return true;
    }
    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}
