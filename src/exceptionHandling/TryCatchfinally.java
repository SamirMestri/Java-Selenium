package exceptionHandling;

public class TryCatchfinally {
	public static void main(String[] args) {
		try {
			System.out.println("Lets begin");
			int a = 10;
			int b = 0;
			System.out.println(a / b);

		}

		catch (ArithmeticException e) { // child
			e.printStackTrace();
			System.out.println("jhaghg");
		}
		
		finally
		{
			System.out.println("Program has completed successfully");
		}
	}


}
