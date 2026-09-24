package p2;

import p1.Vehicle;

public class Car implements Vehicle{
	private String brand;
	private double speed;

	public Car(){ }

	public Car(String brand,double speed){
		this.brand=brand;
		this.speed=speed;
	}



	@Override
	public void start(){
		System.out.println("Car Start ::");
	}

	@Override 
	public void stop(){
		System.out.println("Car Stop");
	}

	@Override 
	public void setSpeed(double speed){
		this.speed=speed;


	}

	@Override
	public double getSpeed(){ return speed; }


}