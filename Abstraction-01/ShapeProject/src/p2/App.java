/*
compile:-  javac -d bin src/p1/Circle.java src/p1/Rectangle.java src/p1/Shape.java src/p1/Square.java src/p2/App.java

run:- java -cp bin p2.App

*/

package p2;

import p1.Shape;
import p1.Circle;
import p1.Rectangle;
import p1.Square;

public class App{
	public static void main(String[] args) {
		Shape s1 = new Circle(4.2,"Red",true);

		Shape s2 = new Rectangle(3.0,4.0,"Black",false);

		Rectangle r1 = new Square(7.0,"Blue",false);

		System.out.println("Circle:"+s1.toString());
		System.out.println("Area Of Circle: "+s1.getArea());
		System.out.println("Perimeter Of Circle: "+s1.getPerimeter());

		System.out.println("-------------------------");
		System.out.println("Rectangle:"+s2.toString());
		System.out.println("Area Of Rectangle: "+s2.getArea());
		System.out.println("Perimeter Of Rectangle: "+s2.getPerimeter());


	}
}



