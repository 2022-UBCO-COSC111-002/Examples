package cosc111_examples.L18_and_L19_Practice_Problems;

public class Circle {

	private double radius;
	private String colour;
	private static int numberOfObjects;
	
	Circle()
	{
		//this.radius = 10;
		//this.setRadius(10);
		//int r = 50/4;
		this(10);
	
		
		//this.colour = "Blu";
		//this("Blu");
	}
	
	Circle(double radius)
	{
		this("Blu");
		this.radius = radius;
	}
	
	Circle(String colour)
	{
		//this.colour = colour;
		this.setColour(colour);
		numberOfObjects ++;

	}
	
	public String getColour() {
		return colour;
	}

	private void setColour(String colour) {
		this.colour = colour;
	}

	
	//This method is used to set instance data and is called....
	//a Setter (Mutator)
	public void setRadius(double radius)
	{
		if (radius < 0)
			this.radius = 0;
		else
			this.radius = radius;
	}
	
	public double getRadius()
	{
		return radius;
	}
	
	public double getArea()
	{
		return Math.PI * this.radius * this.radius;
	}
	
	public double getPerimeter()
	{
		return this.radius * 2 * Math.PI;
		
	}
	
	//This should be static as well!
	//Static methods can only use static variables (no instance data!)
	public static int getNumberOfObjects()
	{
		return numberOfObjects;
	}
	

}
