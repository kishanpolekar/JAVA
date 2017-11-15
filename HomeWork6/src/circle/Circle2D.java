package circle;

/*
The Circle2D class creates a circle object with default values of x-coordinate and
y-coordinate as the center of the circle, and radius, unless given by the user.
All the data members are private. Accessor methods for all data members are
present. A method named getArea() returns the area of the circle and another
method named getPerimeter() returns the perimeter of the circle. A private
static method named distance returns the distance between any two 2D points.
There are three more methods:
1. contains(x: double,y: double): boolean - Returns true if the point is within the circle.
2. contains(circle: Circle2D): boolean - Returns true if the given circle is within the original circle.
3. overlaps(circle: Circle2D): boolean - Returns true if the calling circle and the arguement circle overlap.

 */
public class Circle2D {
    
    private double x=0,y=0,radius=1;
    
    public Circle2D() {} //Initialize default values of 0.0
    
    public Circle2D(double x, double y, double radius) { //User initializes the data members.
    
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    //Accessor for x-coordinate.
    public double getX() {
    
        return x;
    }
    //Accessor for y-coordinate.
    public double getY() {
    
        return y;
    }
    //Accessor for radius.
    public double getRadius() {
    
        return radius;
    }
    
    public double getArea() { //Returns area of the circle using (PI*r*r) formula.
    
        return (Math.PI*radius*radius);
    }
    
    public double getPerimeter() { //Returns perimeter of the circle using (2*PI*r) formula.
    
        return (2*Math.PI*radius);
    }
    
    private static double distance(double x1, double y1, double x2, double y2) { //Calculates distance between two given points.
        
        return (Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2)));
    }
    
    public boolean contains(double x, double y) { //Uses distance() to check if given point is inside the circle.
    
        return (distance(this.x,this.y,x,y)<=this.radius);
    }
    
    public boolean contains(Circle2D circle) { //Uses distance() to check if the given circle is within the original circle.
    
        return ((distance(this.x,this.y,circle.x,circle.y)+circle.radius)<=this.radius);
    }
    
    public boolean overlaps(Circle2D circle) { //Uses distance() to check if the two circles overlap.
    
        return (distance(this.x,this.y,circle.x,circle.y)<=(this.radius+circle.radius));
    }
}//end of Circle2D
