package hierachicalInheritance;

public class Dog extends Animals {
	
	public void sound()
	{
		System.out.println("Bow-Bow");
	}
	
	public static void main(String[] args) {
		
		Dog d=new Dog();
		d.eats();
		d.drinks();
		d.sound();
	}

}
