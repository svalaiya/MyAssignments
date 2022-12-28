package week1.day1;

public class Mobile {
	
	public static void main(String[] args)
	{
		Mobile mob = new Mobile();
		mob.sentSMS();
		mob.takeSnap();
		
	}
	
	public void sentSMS()
	{
		System.out.println("Sent SMS");
	
	}
	
	public void takeSnap()
	{
		System.out.println("Take Snapshot");
	}

}
