package constructor;

public class ParameterizedConstructor {

	//no. of arguments should be different
	//data type of argument should be different 
	//sequence of the argument should be different	
		
		

		ParameterizedConstructor()
		{
			System.out.println("Zero Argument Constructor");
		}
		

		ParameterizedConstructor(int a)
		{
			System.out.println("1(int) Argument Constructor");
		}
		
		ParameterizedConstructor(String str)
		{
			System.out.println("1(String) Argument Constructor");
		}
		
		
		ParameterizedConstructor(int b, int a)
		{
			System.out.println("2(int) Argument Constructor");
		}
		
		
		ParameterizedConstructor(int a, String b)
		{
			System.out.println("2(int, String) Argument Constructor");
		}
		
		ParameterizedConstructor(String b, int a )
		{
			System.out.println("2(String,int) Argument Constructor");
		}
		
		
		public static void main(String[] args) {
			
			new ParameterizedConstructor();
			new ParameterizedConstructor("INDIA");
			new ParameterizedConstructor(40);
			new ParameterizedConstructor(408,90);
			new ParameterizedConstructor(5,"Pune");
			new ParameterizedConstructor("Rose", 40);

		}

	
	//Yes constructor overloading is possible	
	
	
}