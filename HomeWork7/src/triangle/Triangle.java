package triangle;

/*
The Triangle class extends SimpleGeometricObject. The class contains:
- Three double data fields named side1, side2, and side3 with default values 1.0 to
denote three sides of the triangle.
- A no-arg constructor that creates a default triangle.
- A constructor that creates a triangle with the specified side1, side2, and side3.
- The accessor methods for all three data fields.
- A method named getArea() that returns the area of this triangle.
- A method named getPerimeter() that returns the perimeter of this triangle.
- A method named toString() that returns a string description for the triangle.

*/
public class Triangle extends SimpleGeometricObject{ //Triangle extends SimpleGeometricObject.
    
    private double side1=1, side2=1, side3=1;
    
    public Triangle() {} //Initializes the sides to 1.0.
    
    public Triangle(double side1, double side2, double side3, String color, boolean filled) { //User initializes values.
    
        super(color,filled);
        this.side1=side1;
        this.side2=side2;
        this.side3=side3;
    }
    //Accessor for Side 1.
    public double getSide1() {
    
        return side1;
    }
    //Accessor for Side 2.
    public double getSide2() {
    
        return side2;
    }
    //Accessor for Side 3.
    public double getSide3() {
    
        return side3;
    }
    //getArea() calclates area based on semi-perimeter s and sides 1,2,3.
    public double getArea() {
    
        double s=(side1+side2+side3)/2;
        return (Math.pow(s*(s-side1)*(s-side2)*(s-side3),0.5));
    }
    //Returns perimeter of triangle by adding all three sides.
    public double getPerimeter() {
    
        return (side1+side2+side3);
    }
    //Returns string representation of properties.
    @Override
    public String toString() {
    
        return ("Triangle\nSide 1: "+side1+"\tSide 2: "+side2+"\tSide 3: "+side3);
    }
}
