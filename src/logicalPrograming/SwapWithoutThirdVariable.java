package logicalPrograming;

import java.util.Scanner;

public class SwapWithoutThirdVariable {
	
	
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		
		int a=s1.nextInt();
		int b=s1.nextInt();
		
		System.out.println("Before Swaping"+a+"<-->"+b);
		
		a=a+b;//30
		b=a-b;
		a=a-b;
		
		System.out.println("After Swaping"+a+"<-->"+b);
		
	}

}
