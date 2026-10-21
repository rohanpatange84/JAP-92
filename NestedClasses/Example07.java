class Outter{
	int x = 10;

	class Inner{

		int y=20;

		void innerFunction(){
			System.out.println("Inner Function");
		}
	}

	void outterFunction(){
		System.out.println("Outer Function");
	}
}


public class Example07{
	public static void main(String[] args) {

		Outter.Inner in = new Outter().new Inner();

		System.out.println(in.y);
		in.innerFunction();
		
		



	}
}