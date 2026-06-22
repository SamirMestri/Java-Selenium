package controlStatement;

public class Nested_IfElse {

public static void main(String[] args)
{
	System.out.println("Even,Odd or Negative");
	
	int a=7;
	
	if (a>0)
	{
		System.out.println("Nummber is positive");
		if(a%2==0)
		{
			System.out.println("Number is Even");
		}
		else
		{
			System.out.println("NUmber is odd");
		}
		
	}
	else
	{
		System.out.println("Number is Negative");
	}
}
	
}
