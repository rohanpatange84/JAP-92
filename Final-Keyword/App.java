public class App{
	public static void main(String[] args) {
		final int x=10;

		x=12;  //App.java:5: error: cannot assign a value to final variable x

		System.out.println(x);
	}
}