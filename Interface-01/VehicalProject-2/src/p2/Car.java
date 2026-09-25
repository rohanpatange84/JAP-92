package p2;

import p1.Vehicle;

public class Car extends VehicleDetails implements Vehicle{

	private int numberOfDoors;


	public Car(){ }

	public Car(int numberOfDoors){
		this.numberOfDoors=numberOfDoors;

	}

	public Car(String brand, int price, int numberOfDoors){
		super(brand,price);
		this.numberOfDoors=numberOfDoors;
	}

	@Override
	public void start(){
		System.out.println("Car Start ::");
	}
	
	@Override
	public void stop(){
		System.out.println("Car stop ::");
	}

	@Override
	public void displayDetails(){
		System.out.println("------Car Details------");
		System.out.println("Brand: "+super.getBrand());
		System.out.println("Price: "+super.getPrice());
		System.out.println("Number Of Doors: "+numberOfDoors);
	}



}