package p3;

import p1.Pet;
import p2.Animal;
import p2.Spider;
import p2.Cat;
import p2.Fish;


public class App{
	public static void main(String[] args) {

		Animal a1 = new Cat(4,"Catty");
		Animal a2 = new Fish(12,"Fishii");

		a1.eate();
		a1.walk();

		a2.eate();
		a2.walk();
	}
}