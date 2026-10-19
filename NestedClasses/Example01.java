class Outter{
//	private int outerfield=20;
	int outerfield=20;

	public void printOuterData(){
		System.out.println("Outer field "+outerfield);
	}

	class Inner{
 //	 private int innerField=10;
		int innerField=10;

		public void printInnerData(){
		System.out.println("Inner field "+innerField);
		}
	}



}


public class Example01{
	public static void main(String[] args) {

		Outter out = new Outter();

		System.out.println(out.outerfield);
		out.printOuterData();

		// System.out.println(out.innerField);
		// out.printInnerData();

		Outter.Inner in = out.new Inner();


		System.out.println(in.innerField);
		in.printInnerData();

		System.out.println(in.outerfield);
		// in.printOuterData();
		
		


		


	}
}