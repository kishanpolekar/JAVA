
import java.util.Random;

/*
@author: Kishan

Project: P2.java
Description: Generating 10 random numbers between 1 and 5, and display the
frequency of each number.

*/
public class P2 {

    public static void main(String[] args) {

        System.out.println("Random number frequency\n");
        Random r=new Random();
        int val[]=new int[10];
        int fr[]=new int[5];
        System.out.println("The 10 random numbers between 1 and 5 are: \n");
        for (int i=0;i<10;i++) {
        
            val[i] = r.nextInt(5)+1;
            System.out.print((val[i])+"\t");
            fr[val[i]-1]+=1;
        }
        
        System.out.println("\nNumber\tAppears");
        for (int i=0;i<5;i++) {
        
            System.out.println((i+1)+"\t"+fr[i]);
        }

    }
    
}
