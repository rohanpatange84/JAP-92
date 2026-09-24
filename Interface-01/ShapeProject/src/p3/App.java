/*
compile:-  javac -d bin src/p1/Circle.java src/p1/Rectangle.java src/p1/Shape.java src/p1/Square.java src/p2/App.java

run:- java -cp bin p2.App

*/

package p3;

import p1.Shape;
import p2.Circle;
import p2.Rectangle;
import p2.Square;

public class App{
	public static void main(String[] args) {
		Shape s1 = new Circle(4.2);

		Shape s2 = new Rectangle(3.0,4.0);

		Rectangle r1 = new Square(6.2);

		System.out.println("Circle:"+s1.toString());
		System.out.println("Area Of Circle: "+s1.getArea());
		System.out.println("Perimeter Of Circle: "+s1.getPerimeter());

		System.out.println("-------------------------");
		System.out.println("Rectangle:"+s2.toString());
		System.out.println("Area Of Rectangle: "+s2.getArea());
		System.out.println("Perimeter Of Rectangle: "+s2.getPerimeter());

		System.out.println("-------------------------");
		
		System.out.println("Square:"+r1.toString());
		System.out.println("Area Of Square: "+r1.getArea());
		System.out.println("Perimeter Of Square: "+r1.getPerimeter());

		r1.setWidth(2.5);
		r1.setLength(5.5);
		System.out.println("Square:"+r1.toString());



	}
}


