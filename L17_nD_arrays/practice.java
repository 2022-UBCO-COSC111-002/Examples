
public class ArrayExamples {

	static void findLargestSum(double[][] arr)
	{
		double	maxSum = 0;
		int 	rowWithMaxSum = 0;
		
		for (int r = 0; r < arr.length; r++)
		{
			int localSum = 0;
			for (int c = 0; c < arr[r].length; c++) {
				localSum += arr[r][c];
			}
			if (localSum > maxSum)
			{
				rowWithMaxSum = r;
				maxSum = localSum;
			}
		}
		
		System.out.println("The row with the largest sum is row " + rowWithMaxSum);
		
	}
	
	static void findSmallestIndexOfLargestElement(double[][] arr)
	{
		int row = 0, col = 0;
		double largestValue = 0;
		
		for (int r = 0; r < arr.length; r++)
		{
		
			for (int c = 0; c < arr[r].length; c++) {
				if (arr[r][c]  > largestValue)
				{
					row = r;
					col = c;
					largestValue = arr[r][c];
				}
			}
			
		}
		
		System.out.println("The index of the largest value is [" + row + "][" + col + "].");
		
	}
	
	static void randomShuffle(double[][] arr)
	{
		for (int r = 0; r < arr.length; r++)
		{
		
			for (int c = 0; c < arr[r].length; c++) {
				//pick random row and col
				int targetRow = (int)Math.random()*(arr.length+1);
				int targetCol = (int)Math.random()*(arr[r].length+1);
				double tmp = arr[r][c];
				arr[r][c] = arr[targetRow][targetCol];
				arr[targetRow][targetCol] = tmp;
			}
			
		}
		
	}
	
	static void printArray(double [][] arr)
	{
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) 
			System.out.print(arr[r][c] + " ");
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
		double [][] arr = buildRandomArray(3,3,100);
		printArray(arr);
		findLargestSum(arr);
		findSmallestIndexOfLargestElement(arr);
		randomShuffle(arr);
		printArray(arr);

	}

}
