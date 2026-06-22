package methodCalling;

public class MCDC4 {

public static void main(String[] args)
{
	MCDC3 obj = new MCDC3();
	obj.shares();
	obj.etf();
	
	MCDC1 rar = new MCDC1();
	rar.drink();
	MCDC1.eat();
}
	
	
}
