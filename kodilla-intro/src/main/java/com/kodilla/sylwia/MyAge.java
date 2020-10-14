package com.kodilla.sylwia;

public class MyAge {
    public static void main(String[] args) {
        int yourAge = 18;
        if (yourAge < 10) {
            System.out.println("You're a kid");
        } else if (yourAge > 10 || yourAge < 18) {
            System.out.println("You're a teenager");
        } else {
            System.out.println("You're an adult");
        }
    }
}
