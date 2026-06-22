package logicalPrograming;

public class FactorialProgram {
	
	public static void main(String[] args)
	{
		int a[]= {1,2,3,9,9,8,6};
		for(int i=0;i<a.length-1;i++)
			
		{
			for(int j=(i+1);j<a.length;j++)
			{
				if(a[i]==a[j] & i!=j)
				{
					System.out.println(a[i]);
				}
			}
		}
	}}