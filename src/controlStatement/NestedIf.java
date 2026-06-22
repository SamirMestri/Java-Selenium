package controlStatement;

public class NestedIf {
	
	public static void main(String[] args)
	{
		System.out.println("Welcome Blood Donation Camp");
		int age =19;
		int weight=50;
		
	if(age>=18)
		{
			System.out.println("Condition 1 satisfied");
		     if(weight>45)
                    {
	               System.out.println("Condition 2 Satisfied");
	               System.out.println("You are eligible blood donor");
                     }
        }
		else
		{
			System.out.println("You are not eligible");
		}

	}

   	
}
