public class ArrayExamples {

	static void findLargestSum(double[][] arr)
	{
		
	}
	
	static void findSmallestIndexOfLargestElement(double[][] arr)
	{
		
	}
	
	static void randomShuffle(double[][] arr)
	{
		
		
	}
	
	static void printArray(double [][] arr)
	{
		for (int r = 0; r < arr.length; r++) {
			for (int c = 0; c < arr[r].length; c++) 
			System.out.print(arr[r][c] + " ");
			System.out.println();
			} 
		
	}
	
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

	}

}
