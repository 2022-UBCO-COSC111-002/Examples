package cosc111_examples.L03_Practice_Problems;
import java.util.Scanner;

public class P4_Input_Output {
	
	/**
	 * Asks for user's name and prints a greeting
	 * 
	 * 
	 */
	public static void main(String[] args) {

		/**
		 * With user input, don't forget to import Scanner
		 * and instantiate it
		 */
		Scanner in = new Scanner(System.in);
		
		//Ask user your name
		System.out.print("What is your name: ");
		String s = in.nextLine();		//reading the whole line in case user enters more than one
		
		System.out.println(s + ", it is nice to meet you");  //concatenate string 
		
		
		//just some clean up of Scanner objects
		in.close();
		
	}

}
