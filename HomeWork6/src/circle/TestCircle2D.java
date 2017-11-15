package circle;

/*
@author: Kishan

Project: TestCircle2D.java
Description: Creates a Circle2D object c1 (new Circle2D(2, 2, 5.5)) then displays
its area and perimeter. Next, it displays the result of c1.contains(3, 3). Next,
the program displays the result of c1.contains(new Circle2D(4, 5, 10.5)). Finally,
the program displays the result of c1.overlaps(new Circle2D(3, 5, 2.3)).

 */
public class TestCircle2D {

    public static void main(String[] args) {

        System.out.println("2-D Circle\n");
        //Create a new circle with specified values.
        Circle2D c1=new Circle2D(2,2,5.5);
        //Display the results as stated above.
        System.out.printf("The area of Circle 1 is: %.2f\n",c1.getArea());
        System.out.printf("The perimeter of Circle 1 is: %.2f\n",c1.getPerimeter());
        System.out.println("Result of c1.contains(3,3) is: "+c1.contains(3,3));
        System.out.println("Result of c1.contains(new Circle2D(4, 5, 10.5)) is: "+c1.contains(new Circle2D(4, 5, 10.5)));
        System.out.println("Result of c1.overlaps(new Circle2D(3, 5, 2.3)) is: "+c1.overlaps(new Circle2D(3, 5, 2.3)));
    }//end of main
}//end of TestCircle2D
