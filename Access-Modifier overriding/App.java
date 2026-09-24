class A{

	// private void f1(){
	// 	System.out. println("Class A private");     // we can not override private method
	// }

	void f2(){
		System.out.println("Class A default");		//must have the same or wider access modifier than the parent method.
	}

	protected void f3(){
		System.out.println("Class A protected");
	}

	public void f4(){
		System.out.println("Class A public");
	}
}

class B extends A{
	
	// private void f1(){
	// 	System.out.println("Class B private");
	// }

	void f2(){
		System.out.println("Class B default");
	}

	protected void f3(){
		System.out.println("Class B protected");
	}

	public void f4(){
		System.out.println("Class B public");
	}
}

public class App{
	public static void main(String[] args) {
		B b1 = new B();

		b1.f1();
	}
}

///

/* private -- can not override;
	
   default --- default , protected , public 

   protected --- protected, public,

   public ---- public



*/