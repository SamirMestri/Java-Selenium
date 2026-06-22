package methodCalling;

public class MCWC1 {
	
public static void main(String[] args)
{
	MCWC1.fun1();
	MCWC1 obj = new MCWC1();
	obj.fun2();
}
		

public static void fun1()
{
	System.out.println("I am in static method");
	
}
	
public void fun2()
{
	System.out.println("I am in Non-static method");
}
		
	
}
