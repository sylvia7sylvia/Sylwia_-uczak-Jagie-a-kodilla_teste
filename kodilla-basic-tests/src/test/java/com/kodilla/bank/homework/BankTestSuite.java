package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class BankTestSuite {

    @Test
    public void shouldHaveZeroBalance() {
        Bank bank = new Bank();
        int total = bank.totalBalance();
        assertEquals(0, total);
    }

    @Test
    public void shouldHavePositiveBalance() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(100);
        int total = bank.totalBalance();
        assertEquals(100, total);
    }

    @Test
    public void shouldHaveNegativeBalance() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(-100);
        int total = bank.totalBalance();
        assertEquals(-100, total);
    }

    @Test
    public void shouldHaveZeroWithdrawals() {
        Bank bank = new Bank();
        int total = bank.numberOfWithdrawals();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveWithdrawal() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(-100);
        int total = bank.numberOfWithdrawals();
        assertEquals(1, total);
    }

    @Test
    public void shouldHaveNoWithdrawals() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(100);
        int total = bank.numberOfWithdrawals();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveZeroDeposit() {
        Bank bank = new Bank();
        int total = bank.numberOfDeposits();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveNoDeposit() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(-100);
        int total = bank.numberOfDeposits();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveDeposit() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(100);
        int total = bank.numberOfDeposits();
        assertEquals(1, total);
    }

    @Test
    public void shouldHaveZeroAverageOfWithdrawals() {
        Bank bank = new Bank();
        double total = bank.averageOfWithdrawals();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveZeroAverageWithOneWithdrawals() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(0);
        double total = bank.averageOfWithdrawals();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveAverageOfWithdrawals() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(-100);
        bank.cashMachines[0].addTrans(-200);
        double total = bank.averageOfWithdrawals();
        assertEquals(-150, total);
    }

    @Test
    public void shouldHaveNotAverageOfWithdrawals() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(100);
        bank.cashMachines[0].addTrans(200);
        double total = bank.averageOfWithdrawals();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveZeroAverageOfDeposit() {
        Bank bank = new Bank();
        double total = bank.averageOfDeposits();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveZeroAverageWithOneDeposit() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(0);
        double total = bank.averageOfDeposits();
        assertEquals(0, total);
    }

    @Test
    public void shouldHaveAverageOfDeposit() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(100);
        bank.cashMachines[0].addTrans(200);
        double total = bank.averageOfDeposits();
        assertEquals(150, total);
    }

    @Test
    public void shouldHaveNotAverageOfDeposit() {
        Bank bank = new Bank();
        bank.cashMachines[0].addTrans(-100);
        bank.cashMachines[0].addTrans(-200);
        double total = bank.averageOfDeposits();
        assertEquals(0, total);
    }
}



