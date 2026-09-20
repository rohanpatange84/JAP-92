package p2;

import p1.Car;
import p1.Engine;
import p1.Door;
import p1.Light;

public class App{
	public static void main(String[] args) {
		Car c1 = new Car();

		c1.engine.OnEngine();
		c1.light.OffLight();
		c1.door.closeDoor();
	}
}