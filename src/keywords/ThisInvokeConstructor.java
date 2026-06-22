package keywords;

public class ThisInvokeConstructor {

ThisInvokeConstructor()
{
    this(22);
	System.out.println("Non-Parameterized Constructor");
	
}
	
ThisInvokeConstructor(int a)
{
	System.out.println("Parameterized Constructor");	
}
	
	
public static void main(String[] args)
{
	ThisInvokeConstructor t = new ThisInvokeConstructor();
}
	
	
	
	
	
	
	
	
	
	
}
