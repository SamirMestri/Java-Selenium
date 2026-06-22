package interface1;

public class MyRoomChoice {
	
	public static void main(String[] args) {
		
		System.out.println("I am entering in Hall");
		Hall h = new Hall();
		h.tubeLightInHall();
		h.tubeLightInKitchen();
		
		System.out.println("===============================");
		
		System.out.println("I am entering in Kitchen");
		Kitchen k = new Kitchen();
		k.tubeLightInKitchen();
		k.tubeLightInHall();
	}

}
