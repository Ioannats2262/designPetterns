package account;

import currency.Currency;

public class SavingsAccount implements Account{
    public double balance = 0;
    @Override
    public double getBalance(){
        return balance;
    }

    @Override
    public void deposit(double amount, Currency currency) {
        System.out.println("Depositing " +amount + " "+ currency.getSymbol() + " into savings account.");
    }

    @Override
    public void withdraw(double amount, Currency currency) {
        if (balance >= amount) {
            System.out.println("Withdrawing " + amount + " " + currency.getSymbol() + " from savings account.");
            balance -= amount;
        } else {
            System.out.println("Insufficient balance in savings account.");
        }
        }
    }

