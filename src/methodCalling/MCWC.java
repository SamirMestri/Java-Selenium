package methodCalling;

public class MCWC {

public static void movies()
{
	System.out.println("Action,Thriller,Drama,Horror,Sci-Fiction");
}
	
public void webseries()
{
	System.out.print("Breaking Bad,GOT,Vikings");
}
	
public static void main(String args[])
{
	MCWC.movies();
	MCWC obj = new MCWC();
	obj.webseries();	
	
}
		
}
