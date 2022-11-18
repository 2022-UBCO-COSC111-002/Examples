package cosc111_examples.L18_and_L19_Practice_Problems;

public class TestCow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cow bessy = new Cow();
		Cow bossy = new Cow();	
		
		bessy.nickname = "Bessy";
		bossy.nickname = "Bossy";
		
		System.out.println(bessy.nickname);
		System.out.println(bossy.nickname);
		
		bessy.say("Let's go!");
		bossy.say("Let's go as well!");
		
		Cow bart = new Cow(50,"bart");
		System.out.println(bart.nickname);
		System.out.println(bart.stomach);
		
		Cow lisa = new Cow(150,"lisa");
		System.out.println(lisa.nickname);
		System.out.println(lisa.stomach);
	}

}
