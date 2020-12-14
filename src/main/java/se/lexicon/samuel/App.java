package se.lexicon.samuel;


public class App {
    public static void main( String[] args ) {

    CheckingAccount _checkingAccount = new CheckingAccount(101);
        System.out.println("Depositing $500 ...");
        _checkingAccount.deposit(500.00);
        try{
            System.out.println("\n withdrawing $100...");
            _checkingAccount.withdraw(100.00);
            System.out.println("\n withdrawing $600...");
            _checkingAccount.withdraw(600.00);
        } catch (InsufficientFundsException e){
            System.out.println("Sorry, but you are short $" + e.getAmount());
            e.printStackTrace();
        }

        }


    }














