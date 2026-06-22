package logicalPrograming;

public class FibonacchiPractice {
	public static void main (String[]args)
	{
		int a = 5;
		int b = 6;
		int c = 0;
		
		System.out.println(a+" "+b);
	
	while (c<100)
	{
		c=a+b;
		a=b;
		b=c;
		
		System.out.println(" "+c);
	}
	}

}
