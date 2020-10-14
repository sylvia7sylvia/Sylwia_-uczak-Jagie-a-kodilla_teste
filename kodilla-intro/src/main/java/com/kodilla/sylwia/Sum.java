package com.kodilla.sylwia;

public class Sum {
    public static void main(String[] args) {
        int a = 4;
        int b = 20;
        System.out.println("Wynik dodawania " + a + " do " + b + " to " + sum(a, b));
        System.out.println("Wynik potęgowania " + b + " to " + kwadrat(b));
    }

    private static int sum(int x, int y) {
        return x + y;
    }

    private static int kwadrat(int z) {
        //    int result = z*z;
        return z * z;
    }
}
