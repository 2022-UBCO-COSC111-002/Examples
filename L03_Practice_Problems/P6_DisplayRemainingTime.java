package cosc111_examples.L03_Practice_Problems;

import java.util.Scanner;

public class P6_DisplayRemainingTime {

	public static void main(String[] args) {

		/**
		 * With user input, don't forget to import Scanner
		 * and instantiate it
		 */
		Scanner in = new Scanner(System.in);
		
		int timeInSeconds;
		
		//Ask user your name
		System.out.print("Please enter the time in seconds: ");
		timeInSeconds = in.nextInt();	
		
		int minutes = timeInSeconds / 60;  //find the number of minutes by dividing by 60
		int seconds = timeInSeconds % 60;  // and find seconds left over using the modulo 
				
		System.out.println(timeInSeconds + "seconds is " + minutes +" minute(s) and " + seconds + " second(s).");  //concatenate string 
		
		
		//just some clean up of Scanner objects
		in.close();
		
	}


}
