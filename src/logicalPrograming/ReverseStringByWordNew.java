package logicalPrograming;

public class ReverseStringByWordNew {
	public static void main(String[] args) {
		String str ="Java is Best";
		int i,j,k;
		i=str.length()-1;//11
		while(i>=0)//11
		{
			j=i;//11
			while(str.charAt(j)!=' '&j>0)
			{
				j--;
			}
			
			if(j==0)
			{
				k=0;
			}
			else
			{
				k=j+1;
			}
			System.out.print(str.substring(k,i+1));
			System.out.print(" ");
			i=j-1;
		}
		
		
	}

}
