package variables;

public class Variable_local {
	
public static void main(String[] args)
{
	Variable_local b = new Variable_local();
	b.localvariable();
	Variable_local.local1();          
}
	
	
public void localvariable()                  //Non-Static Method
{
	int i=45;                               //Local Variable
	System.out.println(i);
}
	
public static void local1()             //Static Method
{
	int i=50;                        //Local Variable
	System.out.println(i);
}
		
}
