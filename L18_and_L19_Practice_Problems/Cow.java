package cosc111_examples.L18_and_L19_Practice_Problems;

public class Cow {
	String nickname;
	
	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getStomach() {
		return stomach;
	}

	public void setStomach(int stomach) {
		this.stomach = stomach;
	}

	public boolean isFull() {
		return isFull;
	}

	public void setFull(boolean isFull) {
		this.isFull = isFull;
	}

	int stomach;
	boolean isFull;
	
	/**
	 * Remember: Constructors don't have a return type!
	 */
	Cow() 
	{
		stomach = 50;
		nickname = "Anonymous";
	}
	
	Cow(boolean isFull) 
	{
		if (isFull)
		{
			this.stomach = 100;
		}
		else
		{
			stomach = 50;
		}
		nickname = "Anonymous";
		this.isFull = isFull;
	}
	
	
	
	Cow(int stomach, String nickname)
	{
		this.nickname = nickname;
		//this.nickname = nName;
		
		if (stomach > 100)
		{
			this.stomach = 100;
			this.isFull = true;
		}
		else
		{
			this.stomach = stomach;
			this.isFull = false;
		}
	}
	
	public void eat(int amount)
	{
		stomach += amount;
	}
	
	public void say(String msg)
	{
		System.out.println(nickname + " says: " + msg);
	}
}
