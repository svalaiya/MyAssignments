package week1.day2;

public class IsPrime {

	public static void main(String[] args) {
	
		System.out.println("2 is a prime number : " + isprime(2));
		System.out.println("3 is a prime number : " + isprime(3));
		System.out.println("10 is a prime number : " + isprime(10));
		System.out.println("17 is a prime number : " + isprime(17));
	
	}

	public static boolean isprime(int num)
	
	{
		
		for(int i=2;i<num;i++)
		{
			if(num % i== 0)
			{
				return false;
			}
		}
		return true;
		
	}
}
