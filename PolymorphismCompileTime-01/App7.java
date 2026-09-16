class A{
	public void doAdd(byte x,byte y ){
		System.out.println(x+y);
	}

	public void doAdd(int x,byte y){
		System.out.println(x+y);
	}
}

public class App7{
	public static void main(String[] args) {
		A a1 = new A();

		//a1.doAdd(10,20);

		a1.doAdd((byte)10,(byte)20);

		a1.doAdd(10,(byte)25);

	}
}