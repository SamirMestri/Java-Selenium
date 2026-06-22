package variables;

public class WithoutUsingThisKeyword {

int a;
public void fun(int f)
{
	System.out.println(f);
	a=f;
	System.out.println(a);
}
	
	
public void myMethod()
{
	System.out.println(a);
}
		
	
public static void main(String[] args)
{

	WithoutUsingThisKeyword obj = new WithoutUsingThisKeyword();
	obj.fun(56);
	obj.myMethod();
			
	
	
	
	
}
	
}
