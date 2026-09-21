class A{

    final void getInfo(){
		System.out.println("B class");
	}
}

class B extends A{

	void getInfo(){
		System.out.println("B class");
	}
}

public class App3{
	public static void main(String[] args) {
		
		B b1 = new B();



		// App3.java:10: error: getInfo() in B cannot override getInfo() in A
		
	}
}