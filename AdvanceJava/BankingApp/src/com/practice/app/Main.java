
package com.practice.app;

import com.practice.bank.BankAccount;

public class Main {

    public static void main(String[] args) {

        BankAccount account =
                new BankAccount("Rahul", 5000);

        account.deposit(2000);
        account.withdraw(1500);

        System.out.println("Account Holder: "
                + account.getAccountHolder());

        System.out.println("Final Balance: "
                + account.getBalance());
    }
}
