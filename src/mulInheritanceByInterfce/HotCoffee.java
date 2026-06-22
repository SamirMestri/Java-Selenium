package mulInheritanceByInterfce;

public class HotCoffee implements Coffee,Milk,Sugar,CrushedChocolate {

	@Override
	public void addChocolate() {
		System.out.println("Add crushed Chocolate in the Coffee");
		System.out.println("Now the Drink is ready to serve");
		
	}

	@Override
	public void addSugar() {
		System.out.println("Add Sugar in the Milk");
		
	}

	@Override
	public void addMilk() {
		System.out.println("Take HOt Milk in Glass");
		
	}

	@Override
	public void addCoffee() {
		System.out.println("Add 1 Teaspoon of coffee ");
		
	}
	
	
	
	public static void main(String[] args) {
		
		HotCoffee c = new HotCoffee();
		c.addMilk();
		c.addSugar();
		c.addCoffee();
		c.addChocolate();
	}
	
	

}
