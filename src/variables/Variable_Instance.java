package variables;

public class Variable_Instance {

int a=20;            //instance variable
int b=4;
	
public static void main(String[] args)
{
	Variable_Instance J = new Variable_Instance();
	J.substraction();
	J.division();
}

public void substraction()
{
	int c=a-b;
	System.out.println(c);
	
}

public void division()
{
	int d=a/b;
	System.out.println(d);
}

}
