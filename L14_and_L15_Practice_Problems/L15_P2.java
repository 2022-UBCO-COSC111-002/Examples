package cosc111_examples.L14_and_L15_Practice_Problems;

public class L15_P2 {

	public static void main(String[] args) {
		/**
		  	Assume you have an integer array a that 
		 	includes any number of elements, 
		 	e.g. a = {1,2,3,4,5}. 

			1) Write a program that creates a new array b 
			that has the same elements in a but in reverse 
			order; e.g. b = {5,4,3,2,1}. Your code should 
			be general enough to work with any values of a.
	
			2) Write a program that creates a new array c 
			that has the same elements of a but separated 
			by 0’s, e.g. c = {1,0,2,0,3,0,4,0,5,0}
		 */
		
		int[] a = {1,2,3,4,5};
		//make it reverse
		
		int[] b = new int[a.length];
		
		for (int idx = 0; idx < a.length; idx++)
		{
			b[(a.length-1)-idx] = a[idx];
		}
		
		for (int idx = 0; idx < a.length; idx++)
		{
			System.out.println(a[idx] + " " + b[idx]);
		}
		
		
		//and then space it out with 0	
		int[] c = new int[a.length * 2];
		
		for (int idx = 0; idx < a.length; idx++)
		{
			c[2*idx] = a[idx];
			c[2*idx + 1] = 0;   //we don't need to do this as it is 
								//initialized to 0
		}
		
		for (int idx = 0; idx < c.length; idx++)
		{
			System.out.print(c[idx] + " ");
		}
			
	}

}
