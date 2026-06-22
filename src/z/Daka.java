package z;

public class Daka {

	public static void main(String[] args) {
		
		int num=9;
		int flag=0;
		
		for(int i=2;i<num;i++)
		{
			if(num%2==0)
			{
				flag=1;
			}
		}
			
			if(flag==0)
			{
				System.out.println(num+" number is prime");
			}
		
			
			else
			{
				System.out.println(num+" no is not prime");
			}
		}
		
		 
		
	}


