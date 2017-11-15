import java.util.Scanner;

/*
@author: Kishan

Project: HW7Problem2.java
Description: Some websites impose certain rules for passwords. Write a method
that checks whether a string is a valid password. Suppose the password rules are
as follows:
- A password must have at least eight characters. A character is alpha or digit.
- A password consists of only letters and digits. No other symbols.
- A password must contain at least two digits.
Write a program that prompts the user to enter a password and displays Valid
Password if the rules are followed or Invalid Password otherwise.

*/
public class HW7Problem2 {

    public static void main(String[] args) {

        System.out.print("Password Checker\n\nEnter a password: ");
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        
        if (validPass(s)) {
        
            System.out.println("\nValid Password!!\n");
        }
        else {
        
            System.out.println("\nINVALID Password!\n");
        }
    }

    private static boolean validPass(String s) {

        boolean hasLetter=false,hasDigit=false;
        int digits=0;
        
        if (s.length()<8) {
        
            return false;
        }
        
        for (char c : s.toCharArray()) {
            
            if (!Character.isLetterOrDigit(c)) {
            
                return false;
            }
        
            if (Character.isDigit(c)) {
            
                hasDigit=true;
                digits++;
            }
            
            if (Character.isLetter(c)) {
            
                hasLetter=true;
            }
        }
        
        return ((hasDigit || hasLetter) && digits==2);
    }
}
