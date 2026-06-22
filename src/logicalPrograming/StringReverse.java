package logicalPrograming;

public class StringReverse {
	public static void main(String[] args) {
		
	
	String s ="KGF";
	String rev="";
	
	System.out.println(s.length());
	for(int i=s.length()-1;i>=0;i--)
	{
		rev=rev+s.charAt(i);
	}
	System.out.println(rev);
		
	}  
}
