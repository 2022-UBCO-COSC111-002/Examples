package cosc111_examples.L16_Practice_Problems;

/**
 * 1. Ask the user for the number of values (int) to enter
 * 2. Loop and read the values (int) into an array (check to make sure then are in incremental order)
 * 3. Convert to a method that reads in the data and returns an array (need to pass size of array in)
 * 4. Create a method that overloads readArray(Scanner in) that asks user for size as well then create new array
 * 5. Create method to print array
 * 6. Reverse array (print and test)
 * 7. Create method to reverse array
 * 8. merge two arrays and print (assuming that they are in order, smallest to largest)
 * 9. Create method to merge, returning a new, merged array
 * 10. Overload create method, with a reverse option that will merge and then reverse the order (largest to smallest).

 * @author sfazacke
 *
 */

import java.util.Scanner;

public class Practice_Problem_incomplete {
	
	/** @todo complete the merge */
	static int[] merge(int[] a, int[] b)
	{
		int[] c = new int[a.length + b.length];
		
		//c = null;
		
		return c;
	}
	
	static int[] reverseArray(int[] arr)
	{
		int[] b = new int[arr.length];
		
		for (int idx = 0; idx < arr.length; idx++)
		{
			b[(arr.length-1)-idx] = arr[idx];
		}
		
		return b;
	}

	static int[] readArray() {
		Scanner in = new Scanner(System.in);
		int choice = 0;
		System.out.print("How many numbers will the array hold? ");
		choice = in.nextInt();
		in.close();
		return readArray(choice);
		
	}
		
	static int[] readArray(int size) {
		
		Scanner in = new Scanner(System.in);
		
		int[] arr = new int[size];

		for (int i = 0; i < size; i++) {
			System.out.print("Enter the next number: ");
			arr[i] = in.nextInt();
			if (i > 0) {
				while (arr[i] < arr[i - 1]) {
					System.out.println("Enter a number that is greater than the previous");
					arr[i] = in.nextInt();
				}
			}
		}
		
		in.close();
		
		return arr;

	}
	
	static void printArray(int[] arr) {
		System.out.print("The array: ");
		for (int i = 0; i <arr.length ; i++)
		{
			System.out.print(arr[i]+ " ");
		}
	}


	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		
		int[] firstChoices = readArray();
		printArray(firstChoices);
		System.out.println();
		int[] secondChoices = readArray();
		printArray(secondChoices);	
		System.out.println();
		int[] c = reverseArray(firstChoices);
		printArray(c);
		System.out.println();
		c = reverseArray(secondChoices);
		printArray(c);
		
		in.close();
	}

	
}
