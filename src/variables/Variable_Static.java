package variables;

public class Variable_Static {

	
static int m = 100;      //Static Variable
static int n = 10;

public static void main(String[] args)
{
	Variable_Static z = new Variable_Static();
	z.addition();
	Variable_Static.division();
}

public void addition()
{
	int o = m+n;
	System.out.println(m);
	System.out.println(o);
}

public static void division()
{
	int p=m/n;
	System.out.println(n);
	System.out.println(p);
			
}






	
	
}
