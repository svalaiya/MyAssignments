package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		
		Calculator cal = new Calculator();
		int sum= cal.addThreeNumbers(10,20,30);
		System.out.println(sum);
		int mult = cal.multiply(10,5);
		System.out.println(mult);
		cal.divide();
		
        
	}

	public int addThreeNumbers(int a,int b,int c)
	{
		int sum=a+b+c;
		return sum;		
	}
	
	public int multiply(int a,int b)
	{
		int multiply = a*b;
		return multiply;
	}
	
	public void divide()
	{
		
		int a=10;
		int b=5;
		System.out.println(a/b);
	}
	
	
}
