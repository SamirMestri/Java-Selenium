package operators;

public class OREX2 {

public static void main(String[] args)
{
	int m=20;
	int n=30;
	//Logical OR
	System.out.println(m>n || m>n);
	System.out.println(m<n || n>m);
	System.out.println("=========");
	//Bitwise OR
	System.out.println(n<m | n>m);
	System.out.println(n>m | m<n);
}
	
}
