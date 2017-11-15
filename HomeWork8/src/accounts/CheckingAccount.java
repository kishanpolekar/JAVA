
package accounts;

/*
The CheckingAccount class creates a checking account (child of Account) from the
values given by the main method. A checking account balance may go below $0 but
not below the specified overdraft limit. Overdraft means you can withdraw up to
a specific amount before the bank cuts you off. Includes a toString() method to
display account details.

*/
public class CheckingAccount extends Account { //sub-class (child) of Account
    
    private double overdraft;
    //Initializing values for account ID, balance, and overdraft limit.
    public CheckingAccount(int id, double balance, double overdraft) {
    
        super(id,balance); //Invokes parent's constructor.
        this.overdraft=overdraft;
    }
    
    @Override
    public void withdraw(double amt) { //Withdraw an amount from the account.
    
        if ((getBalance()+overdraft)>=amt) { //Balance should not go below overdraft limit.
        
            setBalance(getBalance()-amt);
            if (getBalance()<0) {
            
                overdraft+=getBalance(); //If balance is below zero, deduct from overdraft limit.
            }
            System.out.println("\nAmount "+amt+" withdrawn from account ID "+this.getId());
        } else { //Amount is larger than balance and overdraft, so error message is displayed.
        
            System.out.println("Cannot withdraw amount due to insufficient funds!!");
        }
    }
    
    @Override
    public String toString() { //Display account details in proper fashion.
    
        return ("CHECKING ACCOUNT\nAccount Number(ID): "+getId()+"\nAccount created on: "+
                getDateCreated()+"\nBalance: "+getBalance()+
                "\nOverdraft Limit Remaining: "+overdraft+"\n");
    }
}//end of CheckingAccount
