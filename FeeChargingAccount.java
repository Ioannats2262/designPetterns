package decorator;

public class FeeChargingAccount extends BankAccountDecorator{
    public static final double TRANSACTION_FEE =0.05;

    public FeeChargingAccount(BankAccount decoratedAccount){
        super(decoratedAccount);
    }

    @Override
    public void deposit(double amount) {
        decoratedAccount.deposit(amount-(amount*TRANSACTION_FEE));
    }

    @Override
    public void withdraw(double amount) {
            double withdrawlAmount = amount + (amount *TRANSACTION_FEE);
            decoratedAccount.withdraw(withdrawlAmount);
        }
    }

