package cosc111_examples.L06_PracticeProblems;
import java.util.Scanner;

public class P4_DriversLicense {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int age = 0;
		String answer = "";
		
		System.out.println("Driver's License Test");
		System.out.print("Enter your age: ");
		age = in.nextInt();
		System.out.print("Do you live in BC? (y/n): ");
		answer = in.next();
		//Check to see if char is y or n
		char c = answer.toLowerCase().charAt(0); 		// and forcing it to be lowercase
		if (c == 'y' || c == 'n')
		{
			if (c !='y')
			{
				System.out.println("Invalid Province! Denied");
			}
			else
			{
				if (age < 17)
				{
					System.out.println("Invalid Age! Denied");
				}
				else
				{
					System.out.println("License Approved");
				}
			}
			
		}
		else
		{
			System.out.println("Invalid entry!");
		}
	}

}
