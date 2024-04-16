package decorator;

public class SimpleBankAccount implements BankAccount{
    private double balance;
    public SimpleBankAccount(double initialBalance){
        this.balance=initialBalance;
    }

    @Override
    public void deposit(double amount) {
        balance +=amount;
    }

    @Override
    public void withdraw(double amount) {
        if(balance >=amount){
            balance -=amount;
        } else {
            System.out.println("Indufficient funds!");
        }
    }

    @Override
    public double getBalance() {
        return balance;
    }
}
