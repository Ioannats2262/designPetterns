package Main;

import account.Account;
import account.SavingsAccount;
import bank.Bank;
import currency.Currency;

public class BankAccountExample {
    public static void main(String[] args) {
        Currency usd=new Currency("US Dollar", "$");
        Currency eur=new Currency("Euro", "€");

        Account johnSavings = new SavingsAccount();
        johnSavings.deposit(1000, usd);

        Account janeSavings = new SavingsAccount();
        janeSavings.deposit(1500, eur);

        Bank bank = new Bank();
        bank.addAccount("John`s savings", johnSavings);
        bank.addAccount("Jane`s savings", janeSavings);

        System.out.println("Total bank balance: " + bank.getBalance());
    }
}
