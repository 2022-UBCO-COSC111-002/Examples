package cosc111_examples;
import java.util.Scanner;

/**
 * 
 * @author sfazacke Shows some of the issues we need to be careful with 
 * when dividing integers
 *
 */
public class DivisionThingys {

	public static void main(String[] args) {

		int x = 10;
		int y = 20;
		
		double xx = 10.0;
		double yy = 20.0;
		
		//When dividing and int by an int, don't forget that this will result in an
		//integer value (truncation of floating point (non-whole number part))
		System.out.println(x/y);
		
		System.out.println(1.0*x/y);
		
		System.out.println(xx/y);
		
		System.out.println(x/yy);
		
		System.out.println((double)x/y);
		
		System.out.println(1.0*(x/y));  //<----- watch out!! even though this is cast, the division is done as int

		
		int i = 10;
		i = 10 * i++;
		System.out.println(i);
		
		String str = "This is a string";
		System.out.println(str);
		
		String str2 = new String("Another String");
		System.out.println(str2);
		
		String s1, s2;
		Scanner in = new Scanner(System.in);

		s1 = in.nextLine();	// User enters: abc
		s2 = in.nextLine();	// User enters: abc

		//compares the obect references (reference to the String but not the contents of the strings)
		System.out.println(s1 == s2);


	}

}
