package atm;

/*
The Account class creates an account based on the ID and initial balance given.
Both ID and balance are private members. It has three other methods:
1. viewBalance(): void - Prints the available balance in a particular account.
2. withdraw(amt: double): void - Withdraws a particular amount, making sure the account
                                balance never goes negative. Displays a confirmation.
3. deposit(amt: double): void - Deposits a particular amount in the account.

*/

class Account {

    private int id;
    private double balance;
    //Initializing values for account ID and balance.
    public Account(int id, double balance) {
    
        this.id=id;
        this.balance=balance;
    }
    
    public void viewBalance() { //Display the current account balance.
    
        System.out.printf("\nThe current balance in your account is: $%.2f\n",balance);
    }
    
    public void withdraw(double amt) { //Withdraw an amount from the account.
    
        if ((balance-amt)>=0){ //Making sure account doesn't go into negative balance.
            balance-=amt;
            System.out.printf("\nAn amount of $%.2f withdrawn from your account!\n",amt);
        }
        else { //If account goes in negative balance, no withdrawal takes place and an error message is displayed.
        
            System.out.println("Cannot withdraw amount due to insufficient funds!!");
        }
    }
    
    public void deposit(double amt) { //Deposit an amount to the account.
    
        balance+=amt;
        System.out.printf("\nAn amount of $%.2f deposited to your account!\n",amt);
    }
}//end of Account