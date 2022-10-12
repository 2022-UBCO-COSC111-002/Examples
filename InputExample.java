package cosc111_examples;

import java.util.Scanner;

public class InputExample {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a number (double):");
		//You need to make sure that what you read in is compatible with what the user enters!
		double x = in.nextDouble();
		System.out.println("value: " + x);
		
		

	}

}
