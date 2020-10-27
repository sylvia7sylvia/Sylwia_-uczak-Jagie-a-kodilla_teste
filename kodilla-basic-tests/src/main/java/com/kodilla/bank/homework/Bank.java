package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[] cashMachines;
    private final int size;

    public Bank() {
        this.size = 3;
        this.cashMachines = new CashMachine[this.size];
        for (int i = 0; i < this.size; i++) {
            this.cashMachines[i] = new CashMachine();
        }
    }

    public int totalBalance() {
        int total = 0;
        for (int i = 0; i < this.size; i++) {
            total = total + cashMachines[i].getBalance();
        }
        return total;
    }

    public int numberOfWithdrawals() {
        int count = 0;
        int[] trasactions;

        for (int i = 0; i < this.size; i++) {
            trasactions = cashMachines[i].getValues();
            for (int j = 0; j < cashMachines[i].getSize(); j++) {
                if (trasactions[j] < 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public int numberOfDeposits() {
        int count = 0;
        int[] trasactions;

        for (int i = 0; i < this.size; i++) {
            trasactions = cashMachines[i].getValues();
            for (int j = 0; j < cashMachines[i].getSize(); j++) {
                if (trasactions[j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public double averageOfWithdrawals() {   //wypłata
        double sum = 0;
        int count = 0;
        int[] trasactions;

        for (int i = 0; i < this.size; i++) {
            trasactions = cashMachines[i].getValues();
            for (int j = 0; j < cashMachines[i].getSize(); j++) {
                if (trasactions[j] < 0) {
                    count++;
                    sum = sum + trasactions[j];
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    public double averageOfDeposits() {   //wpłata
        double sum = 0;
        int count = 0;
        int[] trasactions;

        for (int i = 0; i < this.size; i++) {
            trasactions = cashMachines[i].getValues();
            for (int j = 0; j < cashMachines[i].getSize(); j++) {
                if (trasactions[j] > 0) {
                    count++;
                    sum = sum + trasactions[j];
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }
}

