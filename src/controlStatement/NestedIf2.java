package controlStatement;

public class NestedIf2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Welcome to BSE");
		int volume = 150000;
		int RSI = 70;
		
		if(volume>=150000)
		{
			System.out.println("Stock in up trend");
			
			if(RSI<80 & RSI>30)
			{
				System.out.println("Stock have Strength");
				System.out.println("Must Buy");
			}
		}
		else
		{
			System.out.println("Do not buy");
		}
		
		
		
		
	}

}
