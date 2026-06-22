package operators;

public class Logical_Bitwise_OR {

	// 1. Logical OR (||)	
    //	  It will not check second condition if first condition is true
	//    Checks second condition only if first condition is false.	
		
    // 2. Bitwise OR(|)
	//    Bitwise OR will check both the conditions whether first condition is true or false	
		

		public static void main(String[] args) {

			int a = 10;
			int b = 30;
			int c = 50;
			
			System.out.println("===Logical OR====");
			System.out.println(a<b || b<c); //true --true ----> true
			System.out.println(a<b || b>c); //true -- false --> true
			
			System.out.println("===Bitwise OR====");
			System.out.println(a>b | c<a); //false --false ----> false
			System.out.println(a<b | b>c); //true -- false --> true	
	
	
	
		}	
	
	
	
	
	
}
