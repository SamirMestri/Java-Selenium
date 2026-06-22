package hierachicalInheritance;

public class Cat extends Animals {

	public void sounds()
	{
		System.out.println("Meow-Meow");
	}
	
	public static void main(String[] args) {
		
		Cat c = new Cat();
		c.eats();
		c.drinks();
		c.sounds();
	}
}
