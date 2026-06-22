package methodCalling;

public class MCAWC1 {

public void mobile()
{
	System.out.println("I have a mobile");

}
	
public void computer(int a)
{
	System.out.println("I have a computer");	
}

public void laptop(String a)
{
	System.out.println("I have a laptop");
}


public static void main(String[] args)
{
	MCAWC1 obj = new MCAWC1();
	obj.mobile();
	obj.computer(1);
	obj.laptop("abc");
}








}
