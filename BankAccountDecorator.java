package decorator;

public class BankAccountDecorator implements BankAccount{
    protected BankAccount decoratedAccount;
    public BankAccountDecorator(BankAccount bankAccount){
        this.decoratedAccount=decoratedAccount;
    }

    @Override
    public void deposit(double amount) {
        decoratedAccount.deposit(amount);
    }

    @Override
    public void withdraw(double amount) {
        decoratedAccount.withdraw(amount);
    }

    @Override
    public double getBalance() {
        return decoratedAccount.getBalance();
    }
}
