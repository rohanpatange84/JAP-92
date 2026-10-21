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


public class Example08{
	public static void main(String[] args) {

		Outter out =  new Outter();

		out.outterFunction();
	System.out.println(out.x);

	System.out.println(out.new Inner().y);
		



	}
}