package abstractClass;

public class Car extends Fuel {
	
	public void petrol()
	{
		System.out.println("Petrol is filled in car");
	}


	public static void main(String[] args) {
		
		Car c=new Car();
		c.petrol();                   //both way we can call method
		c.ready();
		
		System.out.println("===============================");
		
		Fuel f=new Car();
		f.petrol();
		f.ready();
		
		
	}
}
