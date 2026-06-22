package polymorphism;

public class Icecream extends Panipuri{
	
	public void eat()
	{
	System.out.println("I want to eat Ice cream");
	}
	public static void main(String[] args) {
	Icecream i = new Icecream();
	i.eat();
	Panipuri p = new Panipuri();
	p.eat();
	}

}