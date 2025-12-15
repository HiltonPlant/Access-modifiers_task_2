package banking;

public class BankOperations {

    // A. Open to entire system
    public void showBalance(Account acc) {
        System.out.println("Balance: " + acc.getBalance());
    }

    // B. Restricted to banking processes
    void internalAudit(Account acc) {
        System.out.println("Auditing account: " + acc.getAccountNumber());
    }

    // C. Same-package only operation
    protected void processTransaction(Account acc, double amount) {
        acc.deposit(amount);
        System.out.println("Transaction processed.");
    }
}
