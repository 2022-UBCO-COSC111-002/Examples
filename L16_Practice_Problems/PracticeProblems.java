package cosc111_examples.L16_Practice_Problems;
import java.util.Scanner;
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
public class PracticeProblems {
	
	/**
	 * Overload to include the ask for numbers
	 * @param in
	 * @return
	 */
	static int[] readArray(Scanner in)
	{
		int size;
		System.out.print("How many numbers will the array hold? ");
		size = in.nextInt();
		int[] a;
		a = readArray(size, in);
		return a;
	}
	
	static int[] readArray(int size, Scanner in)
	{
		int[] a = new int[size];
		for (int i = 0; i < size; i++)
		{
			System.out.print("Enter the next number: ");
			int num = in.nextInt();
			if (i==0) a[i] = num;
			else {
				while(num < a[i-1])  //check previous
				{
					System.out.print("Enter a bigger number: ");
					num = in.nextInt();
				}
				a[i] = num;     //could just overwrite
			}
		
		}
		return a;
	}
	
	static void printArray(int arr[])
	{
		System.out.print("The array: ");
		for (int i = 0; i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
	
	static int[] reverse(int[] arr)
	{
		int[] b = new int[arr.length];
		
		for (int i = 0; i < arr.length;i++)
		{
			b[i] = arr[arr.length - 1 - i];
		}
		
		return b;
	}
	
	//this is a bit challenging
	static int[] merge(int[] a, int[]b) 
	{
		
		//calculate new length
		int newLength = a.length + b.length;
		int[] c = new int[newLength];
		int i = 0, j = 0;
		
		for (int z = 0; z < c.length; z++)
		{
			if (i >= a.length)
				c[z] = b[j++];
			else if (j >= b.length)
				c[z] = a[i++];
			else if (a[i] < b[j])
				c[z] = a[i++];
			else
				c[z] = b[j++];		
		}
		
		return c;
		
	}
	
	static int[] merge(int[] a, int[]b, boolean reverse) 
	{
		
		//calculate new length
		int newLength = a.length + b.length;
		int[] c = new int[newLength];
		int i = 0, j = 0;
		
		for (int z = 0; z < c.length; z++)
		{
			if (i >= a.length)
				c[z] = b[j++];
			else if (j >= b.length)
				c[z] = a[i++];
			else if (a[i] < b[j])
				c[z] = a[i++];
			else
				c[z] = b[j++];		
		}
		
		if (reverse)
			return reverse(c);
		else
			return c;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		//System.out.print("How many numbers? ");
		//int number = in.nextInt();
		
		/*int[] a = new int[number];
		*
		 * for (int i = 0; i < number; i++) {
		 * System.out.print("Enter the next number: "); int num = in.nextInt(); if
		 * (i==0) a[i] = num; else { while(num < a[i-1]) //check previous {
		 * System.out.print("Enter a bigger number: "); num = in.nextInt(); } a[i] =
		 * num; //could just overwrite }
		 * 
		 * }
		 */
		
		int[] a;
//		a = readArray(number, in);
//		
//		
//		for (int i = 0; i<a.length;i++)
//			System.out.println(a[i]);
//		
//		printArray(a);
		a = readArray(in);
		printArray(a);
		int[] c = readArray(in);
		
		int[] b;
		System.out.print("Reversed: ");
		b = reverse(a);
		printArray(b);
		System.out.print("Merged: ");
		int[] d = merge(a,c);
		printArray(d);
		System.out.print("Reverse Merged: ");
		d = merge(a,c, true);
		printArray(d);
		
		
	}
}
