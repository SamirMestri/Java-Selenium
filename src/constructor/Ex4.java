package constructor;

public class Ex4 {

int a;
int b;

public Ex4() {
	// TODO Auto-generated constructor stub
	a=10;
	b=15;
	System.out.println(a+b);
}

Ex4(int a)
{
	a=10;
	b=15;
	System.out.println(a*b);
}
	
Ex4(int c , String b)
{
	System.out.println("a,b");
}
	
public static void main(String[] args)
{
	new Ex4();
	new Ex4(44);
	new Ex4(5,"sdd");
}
	
	
}
