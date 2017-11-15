package triangle;

import java.util.Scanner;

/*
@author: Kishan

Project: TestTriangle.java
Description: Creates Triangle object by prompting the user to enter three side
lengths, color, and filled status. Then it creates a triangle object based on 
the values passed. Program displays triangle properties: toString() for sides,
color info, filled info, area, and perimeter.

 */
public class TestTriangle {

    public static void main(String[] args) {

        System.out.println("Triangle\n");
        //User enters triangle properties.
        System.out.println("Enter the three sides of the triangle: ");
        Scanner input=new Scanner(System.in);
        double side1=input.nextDouble();
        double side2=input.nextDouble();
        double side3=input.nextDouble();
        System.out.print("Enter the color of the triangle: ");
        String color=input.next();
        System.out.print("Enter whether the triangle is filled or not (true/false): ");
        boolean filled=input.nextBoolean();
        //Triangle object created using input values.
        Triangle t=new Triangle(side1,side2,side3,color,filled);
        //Print properties using toString() from Triangle.java (overridden) and other methods.
        System.out.println("\nTriangle's Properties\n");
        System.out.printf(t.toString()+"\nColor of the triangle: %s\nFilled status: %s\nArea: %.2f\nPerimeter: %.2f\n"
                ,t.getColor(),t.isFilled(),t.getArea(),t.getPerimeter());
    }//end main
}
//end TestTriangle