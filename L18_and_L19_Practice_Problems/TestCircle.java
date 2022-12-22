package cosc111_examples.L18_and_L19_Practice_Problems;

public class TestCircle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Number of circles: " + Circle.getNumberOfObjects());
		
		Circle c1 = new Circle();
		Circle c2 = new Circle(10);
		Circle c3 = new Circle(20);
		
		System.out.println("Number of circles: " + Circle.getNumberOfObjects());
		System.out.println(c1.getRadius());
		System.out.println(c2.getRadius());
		System.out.println(c3.getRadius());
		
		System.out.println(c1.getArea());
		System.out.println(c1.getPerimeter());
		
		c2.setRadius(100);
		System.out.println(c2.getRadius());
	}

}
