
import java.util.Date;

/*
@author: Kishan

Project: HW4Problem2.java
Description: Creates an account from the default values or from the ones given
by the main method. Accessor and Mutator methods for each data member as all are
private. annualInterestRate is common for all accounts, hence public. Creates
an object of Account class with id=1122 and balance=20,000. Displays the account
info. Then withdraws 2,500 and displays the info. Finally, deposit 3000 and
display the account info.

*/

class Account {

    private int id;
    private double balance;
    private static double annualInterestRate;
    private Date dateCreated=new Date();
    
    public Account() {}
    
    public Account(int someId, double someBalance) {
    
        id=someId;
        balance=someBalance;
        dateCreated=new Date();
    }
    
    public int getId() {
    
        return id;
    }
    
    public void setId(int newId) {
    
        id=newId;
    }
    
    public double getBalance() {
    
        return balance;
    }
    
    public void setBalance(double newBalance) {
    
        balance=newBalance;
    }
    
    public double getAnnualInterestRate() {
    
        return annualInterestRate;
    }
    
    public void setAnnualInterestRate(double newRate) {
    
        annualInterestRate=newRate;
    }
    
    public Date getDateCreated() {
    
        return dateCreated;
    }
    
    public double getMonthlyInterestRate() {
    
        return (annualInterestRate/12);
    }
    
    public double getMonthlyInterest() {
    
        return (balance*(annualInterestRate/12));
    }
    
    public void withdraw(double amt) {
    
        balance-=amt;
        System.out.println("\nAmount "+amt+" withdrawn from account ID "+this.id);
    }
    
    public void deposit(double amt) {
    
        balance+=amt;
        System.out.println("\nAmount "+amt+" deposited to account ID "+this.id);
    }
}
public class HW4Problem2 {

    public static void main(String[] args) {

        System.out.println("Account\n");
        Account acc=new Account(1122,20000);
        acc.setAnnualInterestRate(4.5);
        System.out.print("Account Balance: "+acc.getBalance()+"\nMonthly Interest (in $): "+acc.getMonthlyInterest()+"\nDate Created: "+acc.getDateCreated()+"\n");
        
        acc.withdraw(2500);
        System.out.print("\nAccount Balance: "+acc.getBalance()+"\nMonthly Interest (in $): "+acc.getMonthlyInterest()+"\nDate Created: "+acc.getDateCreated()+"\n");
        
        acc.deposit(3000);
        System.out.print("\nAccount Balance: "+acc.getBalance()+"\nMonthly Interest (in $): "+acc.getMonthlyInterest()+"\nDate Created: "+acc.getDateCreated()+"\n");
        
    }

}
