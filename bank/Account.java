package bank;

public class Account {
    private double balance;
    private String accountNr;

    public Account(double initialCash, String accountNr) {
        this.balance = initialCash;
        this.accountNr = accountNr;
    }

    public void deposit(double cash) {
        if (cash > 0) {
            balance += cash;
        }
    }

    public void withdraw(double cash) {
        if (cash > 0 && cash <= balance) {
            balance -= cash;
        }

    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNr() {
        return accountNr;
    }
}
