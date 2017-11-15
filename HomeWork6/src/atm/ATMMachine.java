package atm;

import java.util.Scanner;

/*
@author: Kishan

Project: ATMMachine.java
Description: Create ten accounts in an array with id 0, 1, . . . , 9, and
initial balance $100. The system prompts the user to enter an id. If the id is
entered incorrectly, ask the user to enter a correct id. Once an id is accepted,
the main menu is displayed as shown in the sample run. You can enter a choice 1
for viewing the current balance, 2 for withdrawing money, 3 for depositing money,
and 4 for exiting the main menu. Once you exit, the system will prompt for an id
again. Thus, once the system starts, it will not stop.

*/
public class ATMMachine {

    public static void main(String[] args) {

        System.out.println("ATM Machine");
        
        Account[] accounts=new Account[10]; //Array of 10 account objects
        
        for (int i=0; i<10; i++) {
        
            accounts[i]=new Account(i,100.0); // Setting initial values to accounts
        }
        
        Scanner input=new Scanner(System.in);
        
        while (true) {
            
            System.out.println("\n!!!AT ANY TIME, ENTER '-100' TO EXIT THE PROGRAM!!!");
            System.out.print("\nEnter an ID: ");
            int id=input.nextInt(); //Getting an account ID from the user.
            if (id>=0 && id<=9) { //Checking if the ID is in the records. If yes, proceed.
                
                int ch=1;
                while (ch!=4) { //If ch==4, user has exited his account and a new ID prompt is displayed.
                    //Displaying the main menu.
                    System.out.println("\n!!!AT ANY TIME, ENTER '-100' TO EXIT THE PROGRAM!!!");
                    System.out.print("\nMain Menu");
                    System.out.print("\n1: Check your balance\n2: Withdraw an amount\n3: Deposit an amount\n4: Exit\nEnter a choice: ");
                    ch=input.nextInt(); //Getting a choice
                    //Using switch control statements for choice. If incorrect choice is entered, an error message is displayed.
                    switch (ch) {
                        case 1:
                            accounts[id].viewBalance();
                            break;
                        case 2:
                            System.out.print("\nEnter an amount to withdraw: ");
                            double wdamt=input.nextDouble();
                            accounts[id].withdraw(wdamt);
                            break;
                        case 3:
                            System.out.print("\nEnter an amount to deposit: ");
                            double depamt=input.nextDouble();
                            accounts[id].deposit(depamt);
                            break;
                        case 4:
                            System.out.println("\nExiting your account!!\n");
                            break;
                        case -100:
                            System.out.println("\nExiting the program!\n");
                            System.exit(0);
                            break;
                        default:
                            System.out.print("Wrong choice!\n");
                            break;
                    }//end of switch
                }//end of while
            }
            else if (id==-100) {
            
                System.out.println("\nExiting the program!\n");
                System.exit(0);
            }
            else { //Execute if ID is not found in records. Display error message.
                
                System.out.print("Wrong ID entered!!\n");
            }
        }//end of while(true)
    }//end of main
}//end of ATMMachine
