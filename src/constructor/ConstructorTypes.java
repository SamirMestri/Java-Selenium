package constructor;

public class ConstructorTypes {

ConstructorTypes() {
	System.out.println("Zero Argument Constructor");
}	
	
ConstructorTypes(int a) {
	System.out.println("1 Argument Contructor type int");
}
	
ConstructorTypes(String a) {
	System.out.println("1 Argument Constructor type String");	
}
	
	
public static void main(String[] args)
{
	new ConstructorTypes();
	new ConstructorTypes(45);
	new ConstructorTypes("newyork");
}
		
}
