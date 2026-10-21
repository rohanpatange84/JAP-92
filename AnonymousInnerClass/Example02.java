abstract class Point{

	abstract void f1();
}

public class Example02{
	public static void main(String[] args) {
		

		new Point(){
			@Override
			public void f1(){
				System.out.println("Pont class");
			}
		}.f1();
	}
}