package com.kodilla.sylwia;

public class Loops {
    public static void main(String[] args) {
        int[] number = new int[5];
        number[0] = 0;
        number[1] = 1;
        number[2] = 2;
        number[3] = 3;
        number[4] = 4;
        int numberOfElements = number.length;
        System.out.println("Tablica zawiera " + numberOfElements + " liczb");
        System.out.println("Suma tych liczb wynosi " + sumNumbers(number) + "!!!");
    }

    public static int sumNumbers(int[] number) {

        int result = 0;
        for (int i = 0; i < number.length; i++) {
            result = result + number[i];
        }
        return result;

    }

    // String[] names = new String[] {"Zygfryd", "Gwidon", "Florentyna"};
    // int numberOfElements = names.length;

    //Pętla for - iterowanie od pierwszego do ostatniego elementu tablicy
    //  for (int i = 0; i < names.length; i++) {
    //  System.out.println(names[i]);
    //}

    // Pętla for - iterowanie od ostatniego do pierwszego elementu tablicy
    // for (int j = names.length - 1; j >= 0; j--) {
    // System.out.println(names[j]);
    // }
    //      System.out.println(numberOfElements);
}