package cosc111_examples.L14_and_L15_Practice_Problems;

public class L15_P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] x = {1, 2, 3, 4};
		//create a copy called y
		int[] y = new int[x.length];
		
		for (int idx = 0; idx < x.length; idx++) 
		{
			y[idx] = x[idx];
		}
		
		for (int idx = 0; idx < x.length; idx++)
		{
			System.out.println(y[idx]);
		}
	
	}

}
