package account;

import currency.Currency;

public interface Account {
    double getBalance();
    void deposit(double amount, Currency currency);
    void withdraw(double amount, Currency currency);
}
