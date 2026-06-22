

package logicalPrograming;

public class FrequencyOfAlphabet {
	
	public static void main(String[] args) {
		
		String s="I love my Country love";
		int counter=0;
		char ac='l';
		
		System.out.println(s.length());
		
		for(int i=0;i<s.length();i++)
		{
			if(ac==s.charAt(i))
			{
				counter++;
			}
			
		}
		System.out.println("frequency "+counter);
		
		
		
		
		
		
		
	}

}
