package test;

import decorator.BankAccount;
import flyweight.BankAccountFactory;

public class TestAccount {
    public static void main(String[] args) {
        BankAccount account = BankAccountFactory.getBankAccount(1000);

        account.deposit(500);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Current Balance: " + account.getBalance());

        account.withdraw(2000);
        System.out.println("Current Balance: " + account.getBalance());
    }
}
