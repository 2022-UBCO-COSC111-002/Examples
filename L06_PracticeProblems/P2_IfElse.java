package cosc111_examples.L06_PracticeProblems;

public class P2_IfElse {

	public static void main(String[] args) {

		//problem #1 - Write an if statement that assigns “positive” to String type if int n is greater than 0. 
		//(just using Math.random to generate n and scaling it to be -10 -> 10
		
		int n = (int)(Math.random() * 20) -10;
		
		String s = "";
		
		if (n > 0)
		{
			s = "positive";
		}
		System.out.println(s);
		
	
		//problem #2 -  Write an if statement that prints out “passed” if grade is larger than or equal to 50, 
		// otherwise print out “failed”.  Using Math.Random again scaled to 0->100
		
		n = (int)(Math.random() * 101);
		
		s = "";
		
		if (n >= 50)
		{
			s = "passed";
		}
		else
		{
			s = "failed";
		}
		System.out.println("status: " + s);
		
		//problem #3 - Write an if statement that increases double pay by 3% if score is greater than 90
		// using same n as above
		
		double pay = 100.0;			//just a value for pay initially
		
		if (n > 90)
		{
			pay = pay * 1.03;		//Multiply by 1.03 (3%)
		}
		
		System.out.println("Pay: " + pay);
	}

}
