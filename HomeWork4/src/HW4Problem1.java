/*
@author: Kishan

Project: HW4Problem1.java
Description: Simple Rectangle which initializes the values with 1,1 for width and
height and returns the area and perimeter based on the input given for the two
parameters.

*/
class Rectangle {
    
    double width=1, height=1;

    public Rectangle() {}

    public Rectangle(double w, double h) {

    	width=w;
	height=h;
    }

    public double getArea() {

	return width*height;
    }

    public double getPerimeter() {

	return (2*(width+height));
    }

}

public class HW4Problem1 {

    public static void main(String[] args) {

	Rectangle r1=new Rectangle (4,40);
	Rectangle r2=new Rectangle (3.5,35.9);

	double area1=r1.getArea();
	double per1=r1.getPerimeter();
	System.out.println("Width: "+r1.width+"\nHeight: "+r1.height+"\nArea: "+area1+"\nPerimeter: "+per1);

	double area2=r2.getArea();
	double per2=r2.getPerimeter();
	System.out.println("Width: "+r2.width+"\nHeight: "+r2.height+"\nArea: "+area2+"\nPerimeter: "+per2);
    }
    
}