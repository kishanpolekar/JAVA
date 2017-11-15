import java.util.Scanner;

/*
@author: Kishan

Project: HW7Problem1.java
Description: The method swapCase returns a new string in which the uppercase
letters are changed to lowercase and lowercase letters are changed to uppercase.
In method swapCase, s variable StringBuilder str = new StringBuilder(s); is
created and the methods in the StringBuilder class are used to modify str and
then the string represented in the StringBuilder object, str, is returned.
The main function of the program prompts the user to enter a string and invokes
this method, and displays the return value from this method.

*/
public class HW7Problem1 {

    public static String swapCase(String s) {
    
        StringBuilder str=new StringBuilder(s); //Created StringBuilder object.
        
        for (int i=0; i<str.length(); i++) {
            
            char c=str.charAt(i); //Get character at i position.
            if (c>=65 && c<=90) { //Check if character is upper case.
            
                str.deleteCharAt(i); //Delete the character in upper case.
                //Insert same character in lower case in the same place by incrementing ASCII value by 32.
                str.insert(i, (char)(c+32));
            }
            else if(c>=97 && c<=122) { //Check if character is lower case.
            
                str.deleteCharAt(i); //Delete the character in lower case.
                //Insert same character in upper case in the same place by decrementing ASCII value by 32.
                str.insert(i, (char)(c-32));
            }
        }
        
        return str.toString();
    } //end swapCase
    
    public static void main(String[] args) {

        System.out.print("Swap Case\n\nEnter a text: ");
        Scanner input=new Scanner(System.in);
        String s=input.nextLine();
        System.out.println("\nOriginal String: "+s);
        System.out.println("\nThe string after swapping cases is: "+swapCase(s));
    } //end main
} //end HW7Problem1
