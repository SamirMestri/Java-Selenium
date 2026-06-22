package logicalPrograming;

public class CheckPrimeNumber {
	
	public static void main(String[] args)
	{
		int a=12;
		int temp=0;
		
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				temp=1;
			}
			
		}
		if(temp==0)
		{
			System.out.println(a+" is prime number");
		}
		else
		{
			System.out.println(a+" is not prime number");
		}
		

	}}
