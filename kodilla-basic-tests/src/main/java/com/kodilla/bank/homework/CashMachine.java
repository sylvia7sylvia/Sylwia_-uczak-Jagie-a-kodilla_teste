package com.kodilla.bank.homework;

public class CashMachine {
    private int[] values;
    private int size;

    public CashMachine() {
        this.size = 0;
        this.values = new int[0];
    }

    public void addTrans(int value) {     //dodaj transakcje
        this.size++;
        int[] newTab = new int[this.size];
        System.arraycopy(values, 0, newTab, 0, values.length);
        newTab[this.size - 1] = value;
        this.values = newTab;
    }

    public int[] getValues() {
        return values;
    }
    public int getSize(){
        return this.values.length;
    }

    public int getTransNumber(){   //ilość transakcji
        return values.length;
    }

    public int getBalance() {    //saldo
        int balance = 0;
        for (int i = 0; i < this.values.length; i++) {
            balance = balance + this.values[i];
        }
        return balance;
    }
}
