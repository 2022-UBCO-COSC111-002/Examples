package cosc111_examples.L14_and_L15_Practice_Problems;
import java.util.Scanner;

public class L14_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		int numElement = 0;
		System.out.println("Enter the number of elements: ");
		numElement = s.nextInt();
		
		double[] arr = new double[numElement];
		
		double sum = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print("Enter element " + i + " :");
			arr[i] = s.nextDouble();
			sum += arr[i];
		}
		
		double avg = sum/arr.length;
		
		System.out.println("Avg: " + avg);
		
		int countAboveAvg = 0;
		
		for (int i = 0; i < arr.length; i++)
		{
			if (arr[i] > avg)
			{
				countAboveAvg++;
			}
		}
		
		System.out.println("Number above: " + countAboveAvg);
		
		
	}

}
