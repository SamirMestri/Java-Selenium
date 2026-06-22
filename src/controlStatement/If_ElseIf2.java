package controlStatement;

public class If_ElseIf2 {
	
	public static void main(String[] args)
	{
		int mango = 12;
		
		if (mango!=0 | mango>0)
		{
			System.out.println("We have mango in our Shop");
		}
		
		else if(mango>10)
		{
			System.out.println("NO need of mango");
		}
		
		else
		{
			System.out.println("Currently Not Available");
		}
	}

}
