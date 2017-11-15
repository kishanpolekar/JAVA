
package accounts;

/*
@author: Kishan
The SavingsAccount class creates a savings account (child of Account) from the
values given by the main method. A savings account balance may not go below $0.
Includes a toString() method to display account details.

*/
public class SavingsAccount extends Account { //sub-class (child) of Account

    //Initializing values for account ID and balance.
    public SavingsAccount(int id, double balance) {
    
        super(id,balance); //Invokes parent's constructor.
    }
    
    @Override
    public void withdraw(double amt) { //Withdraw an amount from the account.
    
        if ((getBalance()-amt)>=0){ //Making sure account doesn't go into negative balance.
            setBalance(getBalance()-amt);
            System.out.printf("\nAn amount of $%.2f withdrawn from your account!\n",amt);
        }
        else { //If account goes in negative balance, no withdrawal takes place and an error message is displayed.
        
            System.out.println("Cannot withdraw amount due to insufficient funds!!");
        }
    }
    
    @Override
    public String toString() { //Display account details in proper fashion.
    
        return ("SAVINGS ACCOUNT\nAccount Number(ID): "+getId()+"\nAccount created on: "+
                getDateCreated()+"\nBalance: "+getBalance()+"\n");
    }
}//end of SavingsAccount
