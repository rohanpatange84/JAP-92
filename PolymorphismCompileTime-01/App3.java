class A{


	public void f1(int x){
		System.out.println(x);
	}

	public int f1(int x){
		return x;
	}
}




public class App3{
	public static void main(String[] args) {

		A a1 = new A();

		int num= a1.f1(35);
		System.out.println(num);

		a1.f1(75);

		// error
		
	}
}