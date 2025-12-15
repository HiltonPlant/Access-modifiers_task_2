package banking;

class Transaction {

    // Default access → same package only
    void execute(Account acc, double amount) {
        acc.deposit(amount);
        System.out.println("Transaction executed.");
    }
}
