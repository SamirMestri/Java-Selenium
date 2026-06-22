package operators;

public class UnaryOperator {

public static void main(String[] args) {
		
		//incremental ---> postfix
		int a = 10;
		System.out.println(a); //10
		System.out.println(a++);// 10 ---> 11
		System.out.println(a); // 11
		System.out.println(a++);//11--->12
		System.out.println(a);//12
		
		//decremental ---> postfix
		System.out.println("===============");
		
		int b = 20;
		System.out.println(b); //20
		System.out.println(b--);//20
		System.out.println(b); //19

		
		//incremental ---> prefix
		System.out.println("===============");
		int c = 30;
		System.out.println(c); //30
		System.out.println(++c); //31
		System.out.println(c); //31
		
		//decremental ---> prefix
		System.out.println("===============");
		 int d = 40;
		 System.out.println(d); //40
		 System.out.println(--d);//39
		 System.out.println(d); //39
	}
	
	
	
	
}
