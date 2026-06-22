package variables;

public class Variable_local2 {

public void fruits(String a)
{
	 double  D=45.00;
	 System.out.println(D);
	 	
}

public static void nuts(int a)
{
	int i=78;
	System.out.println(i);
}

public static void main(String[] args)
{
	Variable_local2.nuts(2);
	Variable_local2 r=new Variable_local2();
	r.fruits("dd");
	
}

}
