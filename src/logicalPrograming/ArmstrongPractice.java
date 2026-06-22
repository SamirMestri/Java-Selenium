package logicalPrograming;

public class ArmstrongPractice {
	
	public static void main(String[] args) {
		
	
	
	int num=1634;
	int temp;
	int rev=0;
	int arm=num;
	
	while(num>0)
	{
		temp=num%10;
		rev=rev+temp*temp*temp*temp;
		num=num/10;
	}
	
	System.out.println(rev);
	
	if(rev==arm)
	{
		System.out.println("Armstrong Number");
	}
	
	else
	{
		System.out.println("Not Armstrong Number");
	}

}
}
