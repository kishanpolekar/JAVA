
import java.util.Scanner;

/*
@author: Kishan

Project: P1.java
Description: Takes 3 inputs from user - Name, Age, future year in main method
and calls another method displayFutureAge(name, currentage, futuredate) that
calculates future age (current age as in 2016), then displays the info.

*/
public class P1 {

    public static void main(String[] args) {

        System.out.println("Future Age Calculator\n");
        Scanner n=new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name=n.nextLine();
        System.out.print("Enter current age: ");
        int age=n.nextInt();
        System.out.print("Enter a year in future: ");
        int year=n.nextInt();
        displayFutureAge(name,age,year);
    }

    public static void displayFutureAge(String name, int age, int year) {
         
        int fage=(year-2016)+age;
        System.out.println(name+" will be "+fage+" years old in "+year);
    }
    
}