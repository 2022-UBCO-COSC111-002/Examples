package cosc111_examples.L14_and_L15_Practice_Problems;

public class L15_P3 {

	public static double min(double[] ar)
	{
		double min = ar[0];
		for (int idx = 1; idx < ar.length; idx++)
		{
			if (ar[idx] < min) 
				min = ar[idx];
		}
		return min;

	}
	
	public static int min(int[] ar)
	{
		int min = ar[0];
		for (int idx = 1; idx < ar.length; idx++)
		{
			if (ar[idx] < min) 
				min = ar[idx];
		}
		return min;

	}
	
	public static int max(int[] ar)
	{
		int max = ar[0];
	
		for (int idx = 1; idx < ar.length; idx++)
		{
			if (ar[idx] > max) 
				max = ar[idx];
		}
		return max;
	}
	
	public static double max(double[] ar)
	{
		double max = ar[0];
	
		for (int idx = 1; idx < ar.length; idx++)
		{
			if (ar[idx] > max) 
				max = ar[idx];
		}
		return max;
	}
	public static void main(String[] args) {
	/**
	 * 	Write two methods that return the minimum and maximum elements of an array with the following headers:
		public static int min(int[] ar)
		public static int max(int[] ar)
		Test your methods with appropriate data. 
	 */
		
		int[] arr = {1, 123, 34, -3, 1025};  //min is -3, max is 1025
	
				
		System.out.println("min : " + min(arr));
		System.out.println("max : " + max(arr));
		
		System.out.println(arr);
	}

}
