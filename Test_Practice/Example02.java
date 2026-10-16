class A{
	 int a;
	 int b;

	public A(){}

	public A(int a, int b){
		this.a=a;
		this.b=b;
	}

	public void printAddition(){
		System.out.println(a+b);
	}

	public void printSubstraction(){
		System.out.println(a-b);
	}
}

class B extends A{

	public B(){}

	public B(int a, int b){
		this.a=a;
		this.b=b;
	}

	public void printMultiplicaation(){
		System.out.println(a*b);
	}

	public void printDivision(){
		System.out.println(a/b);
	}
}


public class Example02{
	public static void main(String[] args) {

		A a1 = new A(12,15);

		B b1 = new B(30,10);

		a1.printAddition();
		a1.printSubstraction();

		System.out.println("--------------------");

		b1.printAddition();
		b1.printSubstraction();
		b1.printMultiplicaation();
		b1.printDivision();


		
	}
}