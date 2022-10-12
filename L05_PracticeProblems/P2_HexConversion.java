package cosc111_examples.L05_PracticeProblems;

import java.util.Scanner;

public class P2_HexConversion {

	public static void main(String[] args) {

		/**
		 * With user input, don't forget to import Scanner
		 * and instantiate it
		 */
		Scanner in = new Scanner(System.in);
		
		//Ask user your name
		System.out.print("Enter a hexidecial value (A through F:");
		String s = in.nextLine();		//reading the whole line in case user enters more than one
		
		char c = s.toUpperCase().charAt(0);
		
		int dec = c - 'A';    			//
		System.out.println(s + ", it is nice to meet you");  //concatenate string 
		
		
		//just some clean up of Scanner objects
		in.close();
		
	}
}
