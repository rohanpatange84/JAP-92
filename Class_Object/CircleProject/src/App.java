public class App{
	public static void main(String[] args) {
		Circle c1= new Circle(2.0,"Blue");
		Circle c2= new Circle(2.0,"red");
		Circle c3= new Circle();
		

		System.out.println("-----c1------");
		System.out.println(c1.getRadius());
		c1.getColour();
		System.out.println(c1.getArea());

		System.out.println("-----c2------");
		System.out.println(c2.getRadius());
		c2.getColour();
		System.out.println(c2.getArea());


        System.out.println("-----c3------");
		System.out.println(c3.getRadius());
		c3.getColour();
		System.out.println(c3.getArea());

		


	}
}