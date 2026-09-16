class A{
	public void f1(){
		System.out.println("A class f1");
	}
}

class B extends A{
	public void f1(){
		System.out.println("B class f1");
	}
}


public class App{
	public static void main(String[] args) {

		A a1 = new A();
		B b1 = new B();
		A a2 = new B();


		a1.f1(); //System.out.println("A class f1");

		b1.f1(); //System.out.println("B class f1");

		a2.f1(); //System.out.println("B class f1");
		
	}
}