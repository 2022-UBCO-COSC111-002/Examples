package cosc111_examples;
import java.util.Scanner;

public class Example2 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		
		//Ask user for temperature
		System.out.println("Enter the temperature in Fahrenheit: ");
		double tempInF = in.nextDouble();
		
		//convert
		double tempInC = (5.0/9)*(tempInF - 32);
		
		//Print output
		System.out.println(tempInF + " in Celcius is: " + tempInC);
		
	
		
		
		
	}

}
