package com.kodilla.bank.homework;

public class Bank {
    public CashMachine[] cashMachines;

    public Bank() {
        this.cashMachines = new CashMachine[3];
        for (int i = 0; i < this.cashMachines.length; i++) {
            this.cashMachines[i] = new CashMachine();
        }
    }

    public int totalBalance() {
        int total = 0;
        for (CashMachine cashMachine : this.cashMachines) {
            total = total + cashMachine.getBalance();
        }
        return total;
    }

    public int numberOfWithdrawals() {
        int count = 0;
        int[] trasactions;

        for (CashMachine cashMachine : this.cashMachines) {
            trasactions = cashMachine.getValues();
            for (int j = 0; j < cashMachine.getSize(); j++) {
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

        for (CashMachine cashMachine : this.cashMachines) {
            trasactions = cashMachine.getValues();
            for (int j = 0; j < cashMachine.getSize(); j++) {
                if (trasactions[j] > 0) {
                    count++;
                }
            }
        }
        return count;
    }

    public double averageOfWithdrawals() {
        double sum = 0;
        int count = 0;
        int[] trasactions;

        for (CashMachine cashMachine : this.cashMachines) {
            trasactions = cashMachine.getValues();
            for (int j = 0; j < cashMachine.getSize(); j++) {
                if (trasactions[j] < 0) {
                    count++;
                    sum += trasactions[j];
                }
            }
        }
        if (count == 0) {
            return 0;
        } else {
            return sum / count;
        }
    }

    public double averageOfDeposits() {
        double sum = 0;
        int count = 0;
        int[] trasactions;

        for (CashMachine cashMachine : this.cashMachines) {
            trasactions = cashMachine.getValues();
            for (int j = 0; j < cashMachine.getSize(); j++) {
                if (trasactions[j] > 0) {
                    count++;
                    sum += trasactions[j];
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

