package logicalPrograming;

public class Fibonacci {
	
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		int c=0;
		System.out.print(a+" "+b);
		
		while(c<50)
		{
			c=a+b;//c=1,c=2,c=3
			a=b;//a=1,a=1,a=2
			b=c;//b=1,b=2,b=3
			
			System.out.print(" "+c);
		}
		
	}

}
