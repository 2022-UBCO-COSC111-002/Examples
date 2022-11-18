package cosc111_examples.L18_and_L19_Practice_Problems;

public class Circle {

	double radius;
	
	Circle()
	{
		this.radius = 10;
	}
	
	Circle(double radius)
	{
		this.radius = radius;
	}
	
	//This method is used to set instance data and is called....
	//a Setter (Mutator)
	public void setRadius(double radius)
	{
		this.radius = radius;
	}
	
	public double getArea()
	{
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter()
	{
		return this.radius * 2 * Math.PI;
	}
}
