package multiLevelInheritence;

public class WhatsappV3 extends WhatsappV2 {
	
	public void Payments()
	{
		System.out.println("User can now add bank");
	}
	
	public static void main(String[] args) {
		
		
		WhatsappV3 w =new WhatsappV3();
		w.Payments();
		w.SendMessage();
		w.ProfileSave();
		w.Calling();
		w.Status();
		
	}
}
