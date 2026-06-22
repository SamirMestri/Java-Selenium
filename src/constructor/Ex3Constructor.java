package constructor;

public class Ex3Constructor {

int a;
int b;

Ex3Constructor() {
	// TODO Auto-generated constructor stub
	a=10;
	b=15;
	System.out.println(a+"<-->"+b);
}
	
Ex3Constructor(int a) {
	a=100;
	b=200;
	System.out.println(a+"<-->"+b);
}

public static void main(String[] args)
{
	new Ex3Constructor();
	new Ex3Constructor(2);
}


}
