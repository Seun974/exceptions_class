package se.lexicon.samuel;



public class CheckingAccount {
    private double balance;
    private int number;

    public CheckingAccount(int number) {
        this.number = number;
    }

    public void deposit(double amount){
        balance += amount;
    }
    //for creating this exception, you have to create a class to extend it

    public void withdraw(double amount) throws InsufficientFundsException {
        if (amount <= balance){
            balance -= amount;
        } else {
            double needs = amount - balance;
            throw new InsufficientFundsException (needs);
        }
    }
    public double getBalance(){
        return balance;
    }
    public int getNumber(){
        return number;
    }

}
