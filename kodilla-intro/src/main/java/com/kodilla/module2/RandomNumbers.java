package com.kodilla.module2;

import java.util.Random;

public class RandomNumbers {
    public static void main(String[] args) {
        int c;

        System.out.println("Losuję liczby z zakresu od 0 do 30");
        System.out.println("Dodaje te liczby do siebie tak długo aż suma będzie >= 5000");
        c = getCountOfRandomNumber(5000);
        System.out.println("Byłem w pętli while " + c);
    }

    public static int getCountOfRandomNumber(int max) {
        int maxNum = 0;
        int minNum = 30;

        Random random = new Random();
        int count = 0;
        int sum = 0;
        while (sum < max) {
            int temp = random.nextInt(31);
            sum += temp;
            count++;

            if (temp < minNum) {
                minNum = temp;
            }
            if (temp > maxNum) {
                maxNum = temp;
            }
        }
        System.out.println("Największa wylosowana liczba to " + maxNum);
        System.out.println("Najmniejsza wylosowana liczba to " + minNum);

        return count;

    }
}
