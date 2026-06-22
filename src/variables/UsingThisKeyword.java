package variables;

public class UsingThisKeyword {

int a;

public void fun(int a)
{
	System.out.println("Local Variable a " + a);
	this.a=a;
	System.out.println(a);
	
}
	
public void myMethod()
{
	System.out.println(a);
}
	
public static void main(String...args)
{
	UsingThisKeyword t= new UsingThisKeyword();
	t.fun(45);
	t.myMethod();
	
}
	
	
	
	
	
	
	
	
}
