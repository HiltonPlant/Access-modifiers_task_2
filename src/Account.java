package banking;

public class Account {

    // A. Secure storage (cannot be accessed directly)
    private String accountNumber;
    private double balance;

    // Constructor
    public Account(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // B. Controlled retrieval
    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    // B. Restricted update (only through rules)
    protected void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }

    protected boolean withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }
}
