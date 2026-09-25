package p3;

import p1.Vehicle;
import p2.VehicleDetails;
import p2.Car;
import p2.Bike;

public class App{
	public static void main(String[] args) {

		Vehicle v1 = new Car("Rolls Royal",1590000,4);
		Vehicle v2 = new Bike("Unicorn",150000,"160cc");

		VehicleDetails car = new Car("Rolls Royal",1590000,4);
		VehicleDetails bike = new Bike("Unicorn",150000,"160cc");

		v1.start();
		v1.stop();
		car.displayDetails();

		v2.start();
		v2.stop();
		bike.displayDetails();

		
		
		
		
	}
}