package operators;

public class Logical_Bitwise_AND {

	//1.LOgical AND(&&)
	//  it will not check second condition if first condition is false
	//  it check second condition only when first condition is true.
	
	//2.Bitwise AND(&)
	//  it will check both the conditon whether first conditon true or false
	
	
	public static void main(String[] args)
	{
		//Logical AND
		System.out.println("===AND Logical===");
		int a=10;
		int b=20;
		System.out.println(a>b && b<a);  //false --false -----> false
		System.out.println(a<b && b>a);  //true -- true ------>True
		System.out.println(a<b && b<a);  //true -- false ----->false
		
		//Bitwise AND
		System.out.println("===AND Bitwise===");
		System.out.println(a<b & b<a);  //true -- false ----->false
		System.out.println(a<b & b>a);  //true -- true ------>True
		
				
	}
	
}
