
class A{
	void f1(byte a,byte b){
		System.out.println(a+b);
	}
}


public class Demo{
	public static void main(String[] args) {

		A a = new A();

		a.f1((byte)10,(byte)20);
		
	}
}