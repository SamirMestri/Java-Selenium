package logicalPrograming;

public class ArmstrongNUm { 
	
	public static void main(String[] args) {
		
	
	
	int num=371; //(3*3*3+7*7*7+1*1*1=371)
	int temp;
	int rev=0;
	int arm=num;
	
	while(num>0)
	{
		temp=num%10;
		rev=rev+temp*temp*temp;
		num=num/10;
	}
	
	System.out.println(rev);
	
	if(arm==rev)
	{
		System.out.println("Armstrong Number");
	}
	else
	{
		System.out.println("Not Armstrong Number");
	}
	
	}
}
