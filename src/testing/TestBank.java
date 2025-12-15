package testing;

import banking.*;

public class TestBank {

    public static void main(String[] args) {

        Account acc = new Account("ACC123", 5000);
        BankOperations bankOps = new BankOperations();

        // Allowed
        bankOps.showBalance(acc);
        System.out.println(acc.getAccountNumber());

        //  NOT ALLOWED (compile-time errors)
        // acc.balance = 10000;              // private
        // acc.deposit(500);                 // protected
        // bankOps.internalAudit(acc);       // default
        // Transaction t = new Transaction();// class not visible
    }
}

