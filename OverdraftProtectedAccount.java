package decorator;

public class OverdraftProtectedAccount extends BankAccountDecorator{
    public OverdraftProtectedAccount(BankAccount decoratedAccount){
        super(decoratedAccount);
    }

    @Override
    public void withdraw(double amount) {
        if(decoratedAccount.getBalance()>=amount){
            decoratedAccount.withdraw(amount);
        } else{
            System.out.println("Overdraft protection activated");
        }
    }
}
