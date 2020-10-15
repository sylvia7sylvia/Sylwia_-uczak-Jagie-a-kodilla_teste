package com.kodilla.module2;

public class Grades {
    int[] grades;         //właściwości (zmienne) klasy OCENY
    private int size;

    public Grades() {      //jeżeli klasa i metoda mają ta samą nazwę to jest to KONSTRUKTOR
        this.grades = new int[10];
        this.size = 0;
    }

    public void add(int value) {      //ta metoda dodaje ocene do tablicy
        if (this.size == 10) {
            return;
        }
        this.grades[this.size] = value;
        this.size++;
    }

    public int last() {              //ta metoda podaje ostatnią ocenę - ostatnią wartość z grades
        if (this.size == 0) {
            return -1;
        }
        return this.grades[this.size - 1];
    }

    public double srednia() {        //ta metoda liczy średnią z ocen
        double sum = 0;
        for (int i = 0; i < this.size; i++) {
            sum = sum + this.grades[i];
        }
        return sum / this.size;
    }
}



