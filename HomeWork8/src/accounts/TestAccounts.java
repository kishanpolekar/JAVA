
package accounts;

/*
@author: Kishan

Project: TestAccounts.java
Description: The TestAccounts program creates objects of Account, SavingsAccount,
and CheckingAccount and invokes their toString() methods. The main method shows
that the classes are working properly. Also, the main makes deposits and withdrawals
from each type of account (Checking and Savings), attempts to go into overdraft.
The main will print output indicating what is going on along the way.

*/
public class TestAccounts {

    public static void main(String[] args) {

        System.out.println("ACCOUNTS\n");
        
        Account acc=new Account(101,10000);
        System.out.println("Account object created!");
        CheckingAccount checkacc=new CheckingAccount(102,5000,100);
        System.out.println("CheckingAccount object created!");
        SavingsAccount savingacc=new SavingsAccount(103,20000);
        System.out.println("SavingsAccount object created!");
        
        System.out.println("\nInvoking Account.toString()...\n");
        System.out.println(acc.toString());
        System.out.println("\nInvoking CheckingAccount.toString()...\n");
        System.out.println(checkacc.toString());
        System.out.println("\nInvoking SavingsAccount.toString()...\n");
        System.out.println(savingacc.toString());
        
        System.out.println("\nWithdrawing $4,500 from CheckingAccount...");
        checkacc.withdraw(4500);
        System.out.println("\nWithdrawing $17,000 from SavingsAccount...");
        savingacc.withdraw(17000);
        System.out.println("\nWithdrawing $550 from CheckingAccount...");
        checkacc.withdraw(550);
        System.out.println("\nInvoking CheckingAccount.toString()...\n");
        System.out.println(checkacc.toString());
        System.out.println("\nWithdrawing $5,000 from SavingsAccount...");
        savingacc.withdraw(5000);
        System.out.println("\nInvoking SavingsAccount.toString()...\n");
        System.out.println(savingacc.toString());
        System.out.println("\nDepositing $5,000 to SavingsAccount...");
        savingacc.deposit(5000);
        System.out.println("\nDepositing $100 to CheckingAccount...");
        checkacc.deposit(100);
        System.out.println("\nInvoking CheckingAccount.toString()...\n");
        System.out.println(checkacc.toString());
        System.out.println("\nInvoking SavingsAccount.toString()...\n");
        System.out.println(savingacc.toString());
    }//end of main
}//end of TestAccounts
