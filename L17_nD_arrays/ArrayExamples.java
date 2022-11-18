package cosc111_examples.L17_nD_arrays;
import java.text.NumberFormat;

/**
 * These are the potential solutions to L17 practice problems (slide 14).
 * Please note that there are mulitple ways to solve these problems. 
 * 
 * I've solved each problem in a static method, just so I can test the code
 * within a single class.  You're solutions may look different.
 * 
 * @author sfazacke
 *
 */
public class ArrayExamples {

	/**
	 * The method accepts a 2d array and finds the row with the largest sum.
	 * 
	 * -for each row, it computes the sum for that row 
	 * and if it is the row with the largest sum it stores the results in a 
	 * local variable.
	 * 
	 * @param arr A 2d array (assuming that it is not ragged)
	 */
	static void findLargestSum(double[][] arr)
	{
		double	maxSum = 0;								//tracks the largest sum
		int 	rowWithMaxSum = 0;							//tracks the row number that has the largest sum 
		
		for (int r = 0; r < arr.length; r++)
		{
			int localSum = 0;							//used to hold the row sum (reset to 0 for each new row)
			for (int c = 0; c < arr[r].length; c++) {	
				localSum += arr[r][c];						//add up the values for the row
			}
			if (localSum > maxSum)							//if the sum for the current row is 
			{
				rowWithMaxSum = r;						//update the row number 
				maxSum = localSum;						//and update the new largest sum
			}
		}
		
		System.out.println("The row with the largest sum is row " + rowWithMaxSum);
		
	}
	
	
	/**
	 * 
	 * Scans the elements and finds the index of the largest element
	 * @param arr a 2d array
	 */
	static void findSmallestIndexOfLargestElement(double[][] arr)
	{
		int row = 0, col = 0;								//tracks the row,col of largest value
		double largestValue = 0;							//the current largest value
		
		for (int r = 0; r < arr.length; r++)
		{
		
			for (int c = 0; c < arr[r].length; c++) {
				if (arr[r][c]  > largestValue)					//check to see if the current value is larger than the previous largest
				{
					row = r;						//update the row, col and the new largest value
					col = c;
					largestValue = arr[r][c];
				}
			}
			
		}
		
		System.out.println("The index of the largest value is [" + row + "][" + col + "].");
		
	}
	
	/**
	 * Randomly moves values in the array 
	 * @param arr a 2D array
	 */
	static void randomShuffle(double[][] arr)
	{
		for (int r = 0; r < arr.length; r++)
		{
		
			for (int c = 0; c < arr[r].length; c++) {				//for each element in the array
				//pick random row and col
				int targetRow = (int)Math.random()*(arr.length+1);		//pick a new random row			
				int targetCol = (int)Math.random()*(arr[r].length+1);		//pick a new random col
				double tmp = arr[r][c];						//create a temp local and store the value to be moved
				arr[r][c] = arr[targetRow][targetCol];				//move the value from the random location to the current location
				arr[targetRow][targetCol] = tmp;				//and then move the tmp to the random location
			}
			
		}
		
	}
	
	/**
	 * Helper method to print out the array
	 * @param arr a 2D array to print
	 */
	static void printArray(double [][] arr)
	{
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) 
			{
				System.out.print(arr[r][c] + " ");
			}
			System.out.println();
			} 
		
	}
	
	/**
	 * Overloaded helper method that allows you to control the number 
	 * of values after the decimal place
	 * @param arr a 2D array to print
	 */
	static void printArray(double [][] arr, int precision)
	{
		NumberFormat nf= NumberFormat.getInstance();
        nf.setMaximumFractionDigits(precision);
        
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) 
			{
				System.out.print(nf.format(arr[r][c]) + " ");
			}
			System.out.println();
			} 
		
	}
	
	
	
	/**
	 * Just some code to randomly create a 2D array
	 * @param row number of rows	
	 * @param col number of colums
	 * @param maxValue maxium value to have
	 * @return
	 */
	static double[][] buildRandomArray( int row, int col, double maxValue)
	{
		double[][] arr = new double[row][col];
		
		for (int r = 0; r < arr.length; r++)
			for (int c = 0; c < arr[r].length; c++)
			arr[r][c] = Math.random()*maxValue;
		
		return arr;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double [][] arr = buildRandomArray(5,5,100);			
		printArray(arr,3);
		findLargestSum(arr);
		findSmallestIndexOfLargestElement(arr);
		randomShuffle(arr);
		printArray(arr,3);

	}

}
