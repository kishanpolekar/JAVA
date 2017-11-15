
package accounts;

import java.util.Date;

/*
The Account class creates an account from the default values or from the ones given
by the main method. Accessor and Mutator methods for each data member as all are
private. annualInterestRate is common for all accounts, hence public. 

*/
class Account {

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated=new Date();
    //Initializing values with default values.
    public Account() {}
    //Initializing values for account ID and balance.
    public Account(int someId, double someBalance) {
    
        id=someId;
        balance=someBalance;
        dateCreated=new Date();
    }
    
    public int getId() { //Return the account ID.
    
        return id;
    }
    
    public void setId(int newId) { //Set a new account ID.
    
        id=newId;
    }
    
    public double getBalance() { //Return the current account balance.
    
        return balance;
    }
    
    public void setBalance(double newBalance) { //Set a new account balance.
    
        balance=newBalance;
    }
    
    public double getAnnualInterestRate() { //Return Annual Interest Rate.
    
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double newRate) { //Set new Annual Interest Rate.
    
        annualInterestRate=newRate;
    }
    
    public Date getDateCreated() { //Return the Date of creation of the account.
    
        return dateCreated;
    }
    
    public double getMonthlyInterestRate() { //Return the Monthly interest rate.
    
        return (annualInterestRate/12);
    }
    
    public double getMonthlyInterest() { //Return the monthly interest amount.
    
        return (balance*(annualInterestRate/12));
    }
    
    public void withdraw(double amt) { //Withdraw an amount from the account.
    
        balance-=amt;
        System.out.println("\nAmount "+amt+" withdrawn from account ID "+this.id);
    }
    
    public void deposit(double amt) { //Deposit an amount to the account.
    
        balance+=amt;
        System.out.println("\nAmount "+amt+" deposited to account ID "+this.id);
    }
}//end of Account