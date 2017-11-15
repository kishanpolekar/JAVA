
import java.util.ArrayList;

public class TestGeometricThing {

    /**
     * Main method
     */
    public static void main(String[] args) {
        // Declare and initialize three geometric objects
        GeometricThing geoThing1 = new Circle(5);
        GeometricThing geoThing2 = new Rectangle(5, 3);
        GeometricThing geoThing3 = new Square(5);

        //Put those objects in an ArrayList of GeometricThing type
        ArrayList<GeometricThing> geo=new ArrayList();
        geo.add(geoThing1);
        geo.add(geoThing2);
        geo.add(geoThing3);
        
        System.out.println("The two objects have the same area? "
                + equalArea(geoThing1, geoThing2));

        // Display circle
        System.out.println("Circle");
        displayGeometricThing(geoThing1);

        // Display rectangle
        System.out.println("Rectangle");
        displayGeometricThing(geoThing2);

        // Display square
        System.out.println("Square");
        displayGeometricThing(geoThing3);

        System.out.println("Do circle and rectangle have same area? "
                + equalArea(geoThing1, geoThing3));

        //Print total area in the ArrayList
        System.out.println("Total area in the ArrayList is "+sumArea(geo));
        
        //Add three new objects of GeometricThing type to the ArrayList
        geo.add(new Rectangle(4,6));
        geo.add(new Circle(8));
        geo.add(new Square(7));
        
        //Print the largest area in the ArrayList
        System.out.println("The largest area is "+findBiggestThing(geo).getArea());
    }

    /**
     * A method for comparing the areas of two geometric objects
     */
    public static boolean equalArea(GeometricThing object1, GeometricThing object2) {
        return object1.getArea() == object2.getArea();
    }

    /**
     * A method for displaying a geometric object
     */
    public static void displayGeometricThing(GeometricThing object) {

        System.out.println("The area is " + object.getArea());
        System.out.println("The perimeter is " + object.getPerimeter());
        System.out.println();

    }
    
    /**
     * A method for getting the sum of areas of all objects in the ArrayList
     */
    public static double sumArea(ArrayList<GeometricThing> list) {
        
        double sum=0;
        
        for (GeometricThing i:list) {
        
            sum+=i.getArea();
        }
        
        return sum;
    }
    
    /**
     * A method for getting the largest area of all objects in the ArrayList
     */
    public static GeometricThing findBiggestThing(ArrayList<GeometricThing> list) {
        
        int max=0;
        
        for (GeometricThing i:list) {
        
            if (i.getArea()>list.get(max).getArea()) {
                
                max=list.indexOf(i);
            }
        }
        
        return list.get(max);
    }
}
