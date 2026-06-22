package upCastingConcept2;

public class Son extends Father {
	
	int age = 30;
	
	public void bike()
	{
		System.out.println("Son's Bike");
	}
	
	public void job()
	{
		System.out.println("Son's job");
	}
	
	
	public static void main(String[] args) {
		
		Father f = new Son();
		f.home();
		f.farm();
		System.out.println(f.age);
		
	}
	

}
