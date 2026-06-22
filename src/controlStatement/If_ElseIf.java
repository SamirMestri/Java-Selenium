package controlStatement;

public class If_ElseIf {

public static void main(String[] args)
{
	int money=40000;
	
	if(money > 3000 && money < 10000)
	{
		System.out.println("I will buy Smart phone");
	}
	
	else if(money > 10000 && money < 30000)
	{
		System.out.println("I will but bicycle");
	}
	
	else if(money > 30000 && money < 100000)
	{
		System.out.println("I will buy Laptop");
	}
	
	else
	{
		System.out.println("Insufficient Money");
	}
}
	
	
	
	
}
