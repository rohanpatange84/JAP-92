package p3;

import p1.Vehicle;
import p2.Bike;
import p2.Car;
import p2.ElectricCar;

public class App{
	public static void main(String[] args) {
		Vehicle v1 = new Bike("Unicorn",125);
		Vehicle v2 = new Car("Duster",280);
		Car c1 = new ElectricCar("Tesla",250);


		v1.start();
		v1.stop();
		System.out.println("Bike speed: "+v1.getSpeed());

		v2.start();
		v2.stop();
		System.out.println("Car speed: "+v2.getSpeed());

		c1.start();
		c1.stop();
		System.out.println("ElectricCar speed: "+c1.getSpeed());
	}

}