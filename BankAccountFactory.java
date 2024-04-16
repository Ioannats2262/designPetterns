package flyweight;

import decorator.BankAccount;
import decorator.SimpleBankAccount;

import java.util.HashMap;

public class BankAccountFactory {
    public static final HashMap<Double, BankAccount>accounts = new HashMap<>();
    public static BankAccount getBankAccount(double initialBalance){
        if(!accounts.containsKey(initialBalance)){
            accounts.put(initialBalance, new SimpleBankAccount(initialBalance));
        }
        return accounts.get(initialBalance);
    }
}
