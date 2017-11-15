package polygon;

public class TestPolygon {

	public static void main(String[] args) {

		RegularPolygon poly1=new RegularPolygon();
		RegularPolygon poly2=new RegularPolygon(6,4);
		RegularPolygon poly3=new RegularPolygon(10,4,5.6,7.8);

		System.out.println("Polygon 1\n");
		System.out.println("The perimeter of Polygon 1 with "+poly1.getN()+" sides is: "+poly1.getPerimeter());
		System.out.printf("The area of Polygon 1 with "+poly1.getN()+" sides and side length "+poly1.getSide()+" is: %.2f\n\n",poly1.getArea());

		System.out.println("Polygon 2\n");
		System.out.println("The perimeter of Polygon 2 with "+poly2.getN()+" sides is: "+poly2.getPerimeter());
		System.out.printf("The area of Polygon 2 with "+poly2.getN()+" sides and side length "+poly2.getSide()+" is: %.2f\n\n",poly2.getArea());

		System.out.println("Polygon 3\n");
		System.out.println("The perimeter of Polygon 3 with "+poly3.getN()+" sides is: "+poly3.getPerimeter());
		System.out.printf("The area of Polygon 3 with "+poly3.getN()+" sides and side length "+poly3.getSide()+" is: %.2f\n\n",poly3.getArea());
	}
}