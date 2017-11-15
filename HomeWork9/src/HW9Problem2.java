
import java.util.*;

/*
@author: Kishan

Project: HW9Problem2.java
Description: The program creates an array with 100 randomly chosen integers,
between 1 and 1000, prompts the user to enter the index of the array, then
displays the corresponding element value. If the specified index is out of bounds,
it displays the message "Out of Bounds" and prints the
ArrayIndexOutOfBoundsException object.

*/
public class HW9Problem2 {

    public static void main(String[] args) {

        int[] a = new int[100]; //Empty array of 100 integer type values.
        Random rand = new Random();
        for (int i=0; i<100; i++) { //Assigning random values to store in the array.
            
            a[i]=rand.nextInt(1000);
        }
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an index: ");
        int index=input.nextInt(); //Gets the index to read from.
            
        try { //Checks if 'index' is between 0 and 99.
            
            System.out.println("Element at position "+index+" is: "+a[index]+"\n");
        }
        catch(ArrayIndexOutOfBoundsException ex) { //Otherwise catches exception and prints details.
            
            System.out.println("Index Out of Bounds!\n"+ex);
        }
    }//end main
}//end HW9Problem2
