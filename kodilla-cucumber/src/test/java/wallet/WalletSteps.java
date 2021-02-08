package wallet;

import io.cucumber.java8.En;
import org.junit.Assert;

public class WalletSteps implements En {

    private final Wallet wallet = new Wallet();
    private final CashSlot cashSlot = new CashSlot();

    public WalletSteps() {

        //---below is --> cash_withdrawal.feature (1st scenario: Successful withdrawal from a wallet in credit)

        Given("^I have deposited (.*) USD in my wallet$", (String cash) -> {
            wallet.deposit(Integer.parseInt(cash));
            Assert.assertEquals("^Incorrect wallet balance$", Integer.parseInt(cash), wallet.getBalance());
        });
        When("^I request (.*) USD$", (String cash) -> {
            Cashier cashier = new Cashier(cashSlot);
            cashier.withdraw(wallet, Integer.parseInt(cash));
        });
        Then("^(.*) USD should be dispensed$", (String cash) -> {
            Assert.assertEquals(Integer.parseInt(cash), cashSlot.getContents());
        });
        Then("^the balance of my wallet should be (.*) USD$", (String cash) -> {
            Assert.assertEquals("^Incorrect wallet balance", Integer.parseInt(cash), wallet.getBalance());
        });

        //---below is --> display_balance.feature

        Given("^there is (.*) USD in my wallet$", (String cash) -> {
            wallet.displayBalance(Integer.parseInt(cash));
            Assert.assertEquals("^Incorrect display of account balance", Integer.parseInt(cash), wallet.getInitialBalance());
        });

        When("^I check the balance of my wallet$", () -> {
            wallet.getInitialBalance();
        });
        Then("^I should see that the balance is (.*) USD$", (String cash) -> {
            Assert.assertEquals("Incorrect wallet balance", Integer.parseInt(cash), wallet.getInitialBalance());
        });

        //---below is --> prevent_withdrawal.feature

        When("^I withdraw (.*) USD$", (String cash) -> {
            wallet.withdrawFromWallet(Integer.parseInt(cash));
        });

        Then("^nothing should be dispensed$", () -> {
            wallet.displayBalance(1);
            wallet.withdrawFromWallet(2);
            Assert.assertNotEquals("^You don't have enough money in your wallet!",
                    String.valueOf(wallet.getInitialBalance()),
                    wallet.withdrawFromWallet(2));
        });
        Then("^I should be told that I don't have enough money in my wallet$", () -> {
            wallet.displayBalance(1);
            String comment = "You don't have enough money in your wallet !";
            Assert.assertEquals(comment, wallet.withdrawFromWallet(2));
        });
    }
}