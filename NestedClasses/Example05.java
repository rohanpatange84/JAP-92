class Outter{

	int outerfield=20;

	public void printOuterData(){
		System.out.println("Outer field "+outerfield);
	}

	static class Inner{

		int innerField=10;

		public void printInnerData(){
		System.out.println("Inner field "+innerField);
		}
	}



}


public class Example05{
	public static void main(String[] args) {

		Outter.Inner in = new Outter.Inner();

		in.printInnerData();

		

		


	}
}