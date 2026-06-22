package methods;

public class Nonstatic1 {

public static void main(String[] args)
{
	Nonstatic1 obj = new Nonstatic1();
	obj.myMethod();
}
	
	

public void myMethod()
{
	System.out.print("Non-Static method is preferable");
	
}
	
}
