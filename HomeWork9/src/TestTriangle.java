
import java.util.Scanner;

/*
@author: Kishan

Project: TestTriangle.java
Description: The TestTriangle program takes three inputs for three sides of a 
triangle. It checks if the sum of any two sides is greater than the other side.
If yes, it creates a triangle with the specified sides and displays its area,
perimeter, and all the sides properly. If not, it generates an
IllegalTriangleException and prints out the details of the exception.
The Triangle2 class has a default constructor that makes a triangle with sides
1,1,1. If the user gives the sides, the constructor with parameters first checks
if the triangle condition is met, and if not, it throws an exception back to the
main where the object creation call is written. It has accessor methods for each
side as all sides are private, a getArea method that returns the area of the 
triangle, a getPerimeter method that returns the perimeter of the triangle, and
a toString method that displays the triangle information in proper format.
The IllegalTriangleExctption is a custom made exception class that extends
Exception and displays the problem if the triangle cannot be created.

*/
public class TestTriangle {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //User enters three sides.
        System.out.print("Enter three sides: ");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        try{ //Checks if triangle condition is met.
            
            Triangle2 triangle = new Triangle2(side1, side2, side3); //Prints area.
            System.out.println("The area is " + triangle.getArea()); //Prints perimeter.
            System.out.println("The perimeter is "
                + triangle.getPerimeter());
            System.out.println(triangle); //Prints triangle details.
        }
        catch(IllegalTriangleException it) { //Otherwise prints out exception details.
            
            System.out.println("Cannot make triangle.\n"+it);
        }
    }//end main
}//end TestTriangle

class Triangle2 {

    private double side1 = 1.0, side2 = 1.0, side3 = 1.0;

    /**
     * Constructor: Initializes variables with default values.
     */
    public Triangle2() {}

    /**
     * Constructor: Initializes variables with values entered by the user.
     */
    public Triangle2(double side1, double side2, double side3) throws IllegalTriangleException{
        
        if ((side1+side2)>side3 && (side3+side2)>side1 && (side1+side3)>side2) { //Checks if triangle contition is satisfied.
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        } else { //If not, an exception object is created and thrown back to main.
            throw new IllegalTriangleException(side1,side2,side3);
        }
    }

    public double getSide1() { //Returns first side.
        return side1;
    }

    public double getSide2() { //Returns second side.
        return side2;
    }

    public double getSide3() { //Returns third side.
        return side3;
    }

    public double getArea() { //Returns area based on Heron's formula.
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double getPerimeter() { //Returns perimeter.
        return side1 + side2 + side3;
    }

    @Override
    public String toString() { //Returns triangle properties in proper format.
        // Implement it to return the three sides
        return "Triangle: side1 = " + side1 + " side2 = " + side2
                + " side3 = " + side3;
    }
}//end Triangle2

class IllegalTriangleException extends Exception { //Custom made exception class.

    public IllegalTriangleException (double side1, double side2, double side3) {
        
        super("A triangle must have any two sides add up to more than the third side!"); //Prints the exception with this message.
    }
}//end IllegalTriangleException