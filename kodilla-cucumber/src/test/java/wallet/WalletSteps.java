package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private Wallet wallet = new Wallet();
    private CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        //---below is --> cash_withdrawal.feature (1st scenario: Successful withdrawal from a wallet in credit)

        Given("I have deposited $200 in my wallet", () -> {
            wallet.deposit(200);
            Assert.assertEquals("Incorrect wallet balance",200,wallet.getBalance());
        });
        When("I request $30", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,30);
        });
        Then("$30 should be dispensed", () -> {
            Assert.assertEquals(30,cashSlot.getContents());
        });
        Then("the balance of my wallet should be $170", () -> {
            Assert.assertEquals("Incorrect wallet balance",170,wallet.getBalance());
        });

        //---below is --> cash_withdrawal.feature (2nd scenario: Successful withdrawal of 0$ from a wallet in credit)

        Given("I have deposited $100 in my wallet", () -> {
            wallet.deposit(100);
            Assert.assertEquals("Incorrect wallet balance",100,wallet.getBalance());
        });
        When("I request $0", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,0);
        });
        Then("$0 should be dispensed", () -> {
            Assert.assertEquals(0,cashSlot.getContents());
        });

        //---below is --> cash_withdrawal.feature (3rd scenario: Successful withdrawal of 50$ from a wallet in credit)

        Given("I have deposited $50 in my wallet", () -> {
            wallet.deposit(50);
            Assert.assertEquals("Incorrect wallet balance",50,wallet.getBalance());
        });
        When("I request $50", () -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet,50);
        });
        Then("$50 should be dispensed", () -> {
            Assert.assertEquals(50,cashSlot.getContents());
        });

        //---below is --> display_balance.feature

        Given("there is $54 in my wallet", () -> {
            wallet.displayBalance(54);
            Assert.assertEquals("Incorrect display of account balance",54,wallet.getInitialBalance());
        });
        Given("there is $123 in my wallet", () -> {
            wallet.displayBalance(123);
            Assert.assertEquals("Incorrect display of account balance",123,wallet.getInitialBalance());
        });
        Given("there is $111 in my wallet", () -> {
            wallet.displayBalance(111);
            Assert.assertEquals("Incorrect display of account balance",111,wallet.getInitialBalance());
        });
        Given("there is $325 in my wallet", () -> {
            wallet.displayBalance(325);
            Assert.assertEquals("Incorrect display of account balance",325,wallet.getInitialBalance());
        });
        Given("there is $-22 in my wallet", () -> {
            wallet.displayBalance(-22);
            Assert.assertEquals("Incorrect display of account balance",-22,wallet.getInitialBalance());
        });
        When("I check the balance of my wallet", () -> {
            wallet.getInitialBalance();
        });
        Then("I should see that the balance is $54", () -> {
            Assert.assertEquals("Incorrect wallet balance",54,wallet.getInitialBalance());
        });
        Then("I should see that the balance is $123", () -> {
            Assert.assertEquals("Incorrect wallet balance",123,wallet.getInitialBalance());
        });
        Then("I should see that the balance is $111", () -> {
            Assert.assertEquals("Incorrect wallet balance",111,wallet.getInitialBalance());
        });
        Then("I should see that the balance is $325", () -> {
            Assert.assertEquals("Incorrect wallet balance",325,wallet.getInitialBalance());
        });
        Then("I should see that the balance is $-22", () -> {
            Assert.assertEquals("Incorrect wallet balance",-22,wallet.getInitialBalance());
        });

        //---below is --> prevent_withdrawal.feature

        Given("there is $1 in my wallet", () -> {
            wallet.displayBalance(1);
            Assert.assertEquals("Incorrect display of account balance",1,wallet.getInitialBalance());
        });
        Given("there is $10 in my wallet", () -> {
            wallet.displayBalance(10);
            Assert.assertEquals("Incorrect display of account balance",10,wallet.getInitialBalance());
        });
        Given("there is $20 in my wallet", () -> {
            wallet.displayBalance(20);
            Assert.assertEquals("Incorrect display of account balance",20,wallet.getInitialBalance());
        });
        When("I withdraw $2", () -> {
            wallet.withdrawFromWallet(2);
        });
        When("I withdraw $20", () -> {
            wallet.withdrawFromWallet(20);
        });
        When("I withdraw $30", () -> {
            wallet.withdrawFromWallet(30);
        });
        Then("nothing should be dispensed", () -> {
            wallet.displayBalance(1);
            wallet.withdrawFromWallet(2);
            Assert.assertNotEquals("You don't have enough money in your wallet!",wallet.getInitialBalance(),wallet.withdrawFromWallet(2));
        });
        Then("I should be told that I don't have enough money in my wallet", () -> {
            wallet.displayBalance(1);
            String comment = "You don't have enough money in your wallet !";
            Assert.assertEquals(comment, wallet.withdrawFromWallet(2));
        });
    }
}