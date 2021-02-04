package wallet;

public class Wallet {
    private int balance = 0;
    private int display;
    private int initialBalance;
    private String comment;

    public Wallet() {
    }

    public void deposit(int money) {
        this.balance = balance + money;
    }

    public int getBalance() {
        return balance;
    }

    public void displayBalance (int currentMoney) {
        this.display = currentMoney;
    }

    public int getInitialBalance () {
        this.initialBalance = display;
        return initialBalance;
    }

    public void debit(int money) {
        this.balance = balance - money;
    }

    public String withdrawFromWallet(int withdrawMoney) {
        if (withdrawMoney > getInitialBalance()) {
            initialBalance = initialBalance;
            comment = "You don't have enough money in your wallet !";
        }
        else if (withdrawMoney <= getInitialBalance()) {
            initialBalance = initialBalance - withdrawMoney;
            comment = "You have just withdrawed money.";
        }
        return comment;
    }
}
