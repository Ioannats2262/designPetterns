package bank;

import account.Account;
import currency.Currency;

import java.util.HashMap;
import java.util.Map;

public class Bank implements Account {
    private Map<String, Account> accounts = new HashMap<>();
    public void addAccount(String accountNumber, Account account){
        accounts.put(accountNumber, account);
    }
    public Account getAccount(String accountNumber){
        return accounts.get(accountNumber);
    }

    @Override
    public double getBalance() {
        double totalBalance=0;
        for(Account account : accounts.values()){
            totalBalance+= account.getBalance();
        }
        return totalBalance;
    }

    @Override
    public void deposit(double amount, Currency currency) {
        System.out.println("Depositing " + amount + " " +currency.getSymbol() + "into bank.");
    }

    @Override
    public void withdraw(double amount, Currency currency) {
        System.out.println("Withdrawing " + amount + " " + currency.getSymbol() + "from bank.");
    }
}
