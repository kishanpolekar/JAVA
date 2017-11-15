/* Created a class Square that is a child
   of the abstract class GeometricObect.

   Square
   - side : double   //default value of 1.0
   +Square()   //sets side to default of 1.0
   +Square(side : double)   //sets property side to parameter side.
   +getSide() : double  //returns the property side.
   +toString() : String  //returns a string that describes the side value.

 */

public class Square extends GeometricThing {

    private double side = 1.0;

    public Square() {}

    public Square(double side) {

        this.side = side;
    }

    /**
     * Return side 
     */
    public double getSide() {

        return side;
    }

    /**
     * Return string with square side info 
     */
    public String toString() {

        return ("The square is created with side length " + side + " units.");
    }

    /**
     * Return perimeter
     */
    @Override
    public double getPerimeter() {

        return (4 * side);
    }

    /**
     * Return area
     */
    @Override
    public double getArea() {

        return (side * side);
    }
}
