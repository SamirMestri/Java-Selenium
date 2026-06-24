package basics;

public class NonStaticMethod {

    public  void method(){
        System.out.println("this is a static method");
    }
    public static void main(String[] args){

        NonStaticMethod obj = new NonStaticMethod();
        obj.method();
    }

}
