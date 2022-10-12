package cosc111_examples.L07_PracticeProblems;

public class P02_ConditionalOperators {

	public static void main(String[] args) {
	
		/** Covert to conditional (ternary) operator
		 * 	if (x % 2 == 0)
				s = “even”;
			else
				s = “odd”;
		*/
		String s = "";
		int x = 3;	//testing value
		
		s = (x % 2 == 0) ? "even" : "odd" ;
		

		
		/** Covert to conditional (ternary) operator
			if (y >= 10)
				x = 100;
			else
				x = -100;
		 */
		int y = 9;   //testing value
		
		x = (y >= 10)? 100 : -100;
		
	
	}

}
