package p2;

import p1.Circle;
import p1.Cylinder;

public class App{
	public static void main(String[] args) {

		Circle c1=new Circle(20,"Black");

		Cylinder cyl=new Cylinder(30,40,"Pink");


		double area=cyl.getArea();

		System.out.println(area);
		System.out.println(c1.getArea());
		
	}
}

/*
for compile code:
"javac -d bin src/p1/Circle.java src/p1/Cylinder.java src/p2/App.java"

run code 
"java -cp bin p2.App"

*/