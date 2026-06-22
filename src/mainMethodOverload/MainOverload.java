package mainMethodOverload;

public class MainOverload {
	
	public static void main(String[] args)
	{
		System.out.println("This is our Original method defined by dev");
		
		main(6);
		main(4,5);
	}
	
	public static void main(int a) {
		
		System.out.println("int in argument");
		
	}
	
	public static void main(int a,int b) {
		
		System.out.println("int,int in program");
		
	}

}
