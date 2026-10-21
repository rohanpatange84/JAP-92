interface PInner{
	void innerFunction();

}

class Outter{
	int x = 10;

	private class Inner implements PInner{

		int y=20;

		public void innerFunction(){
			System.out.println("Inner Function");
		}
	}

	void outterFunction(){
		System.out.println("Outer Function");
	}


	public PInner getInner(){
		return new Inner();
	}
}


public class Example09{
	public static void main(String[] args) {

		Outter out =  new Outter();

		PInner in = out.getInner();

		in.innerFunction();
		



	}
}