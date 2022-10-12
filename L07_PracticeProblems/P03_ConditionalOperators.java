package cosc111_examples.L07_PracticeProblems;

public class P03_ConditionalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* score = (x > 10) ? 3 * scale : 4 * scale;
		 * Rewrite using if-else
		 */
		
		//just some example values
		int x = 0, scale = 10;
		int score;
		
		if (x > 10)
		{
			score = 3 * scale;
		}
		else
		{
			score = 4 * scale;
		}
		
		/*
		* System.out.println( (number % 3 == 0) ? i : j );
		* re-write using if-else
		*/
		
		//just some test values
		int number = 3, i = 10, j = 20;
		if (number % 3 == 0)
		{
			System.out.println(i);
		}
		else
		{
			System.out.println(i);
		}
		
		/*
		Write conditional expression that returns -1 or 1 randomly.
		*/
		
		int value = ((int)(Math.random()*2)) == 0 ? -1 : 1;
	}
}
