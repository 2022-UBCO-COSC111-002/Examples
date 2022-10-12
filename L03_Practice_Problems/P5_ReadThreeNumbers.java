package cosc111_examples.L03_Practice_Problems;

import java.util.Scanner;

public class P5_ReadThreeNumbers {

		public static void main(String[] args) {
	
			/**
			 * With user input, don't forget to import Scanner
			 * and instantiate it
			 */
			Scanner in = new Scanner(System.in);
			
			int x, y, z;
			//Ask user your name
			System.out.println("Please enter three numbers (ints): ");
			System.out.print("Number 1: ");
			x = in.nextInt();	// get first int
			System.out.print("Number 2: ");
			y = in.nextInt();	//get second int
		
			System.out.print("Number 3: ");
			z = in.nextInt();	//get third int
			
			double avg = (double)(x+y+x)/3;		//casting sum as double so I don't loose the floating point part
			
			System.out.println("The average of " + x +" + " + y +" + " + z + " is: " + avg);  //concatenate string 
			
			
			//just some clean up of Scanner objects
			in.close();
			
		}

}
