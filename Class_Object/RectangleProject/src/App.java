public class App{
	public static void main(String[] args) {
		Rectangle r1=new Rectangle();

		Rectangle r2=new Rectangle(3.4f,5.2f);

		System.out.println("Length : "+r1.getLength());
		System.out.println("Length : "+r2.getLength());


		r2.setLength(2.6f);

		System.out.println("Length : "+r2.getLength());



	}
}