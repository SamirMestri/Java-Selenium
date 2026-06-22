package constructor;

public class Constructor {

	//1. Variable Declaration
	//2. Variable initialization
	//3. Usage
	
	String name;     //Declaration
	int age;
	
	
	Constructor()
	{
		name="Rahul";   //initiazation
		age=25;
		
		
		System.out.println("Name is "+name+" and age is "+age);
	}

public static void main(String[] args)
{
	new Constructor();
	
}
	
	
	
}
