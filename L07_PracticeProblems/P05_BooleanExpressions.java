package cosc111_examples.L07_PracticeProblems;

public class P05_BooleanExpressions {

	public static void main(String[] args) {
	
		int x = 1;
		
		System.out.println("(true) && (3 > 4): " + ((true) && (3 > 4)));
		System.out.println("!(x > 0) && (x > 0): " + (!(x > 0) && (x > 0)));
		System.out.println("(x > 0) || (x < 0): " + ((x > 0) || (x < 0)));
		System.out.println("(x != 0) || (x == 0): " + ((x != 0) || (x == 0)));
		System.out.println("(x >= 0) || (x < 0): " + ((x >= 0) || (x < 0)));
		System.out.println("(x != 1) == !(x == 1): " + ((x != 1) == !(x == 1)));

	}

}
