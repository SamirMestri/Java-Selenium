package stringManipulation;

public class StringMethods {
	
	public static void main(String[] args)
	{
		String S1="Rahul Mestri";
		String S2="rahul mestri";
		String S3="Automation Test ENgineer";
		
		char c=S1.charAt(3);
		System.out.println(c);
		
	    System.out.println(S1.charAt(9));
	    boolean b=S1.endsWith("tri");
	    System.out.println(b);
	    
	    System.out.println(S3.endsWith("neer"));
	    System.out.println(S1.startsWith("RA"));
	    System.out.println(S1.equals(S2));
	    System.out.println(S1.equalsIgnoreCase(S2));
	    System.out.println(S1.length());//Start with 1
//	    System.out.println(S1.isEmpty());
//	    System.out.println(S1.toLowerCase());
//	    System.out.println(S1.toUpperCase());
//	    System.out.println(S1.indexOf('u'));
	    System.out.println(S1.concat(S3));
//	    System.out.println(S3.lastIndexOf('e'));
//	    System.out.println(S1.substring(3));
//	    System.out.println(S1.substring(3,9));
//	    System.out.println(S1.replace("Mestri", "MESTRY"));
//	    
//	    System.out.println(S3.replace("Automation Test ENgineer","automation test engineer"));
//	   
				
	}

}
