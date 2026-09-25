package p3;

import p1.Vehicle;
import p2.VehicleDetails;
import p2.Car;
import p2.Bike;

public class App{
	public static void main(String[] args) {

		Car carObj = new Car("Rolls Royal",1590000,4);
		Bike bikeObj = new Bike("Unicorn",150000,"160cc");

		Vehicle v1 = carObj;
		Vehicle v2 = bikeObj;

		VehicleDetails car = carObj;
		VehicleDetails bike = bikeObj;

		v1.start();
		v1.stop();
		car.displayDetails();

		v2.start();
		v2.stop();
		bike.displayDetails();

		
		
		
		
	}
}