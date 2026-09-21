final class A{
	void getA(){
		System.out.println("A class");
	}
}

class B extends A{
	void getB(){
		System.out.println("B class");
	}
}

public class App2{
	public static void main(String[] args) {

		B b1= new B();

		b1.getA();
		b1.getB();


		//App2.java:7: error: cannot inherit from final A
		
	}
}