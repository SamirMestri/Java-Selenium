package keywords;

public class ThisInvokeMethod {

public void myMethod()
{
	System.out.println("Hello Rahul");
}
	
public void myMethod2()
{
	myMethod();               //this.myMethod();
	System.out.println("Happy Republic Day");
}
	
public static void main(String[] args)
{
	ThisInvokeMethod t = new ThisInvokeMethod();
	t.myMethod2();
}
	
	
}
