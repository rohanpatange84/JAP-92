package p2;

import p1.Vehicle;

public class Bike implements Vehicle{
	private String brand;
	private double speed;

	public Bike(){ }

	public Bike(String brand,double speed){
		this.brand=brand;
		this.speed=speed;
	}



	@Override
	public void start(){
		System.out.println("Bike Start ::");
	}

	@Override 
	public void stop(){
		System.out.println("Bike Stop");
	}

	@Override 
	public void setSpeed(double speed){
		this.speed=speed;


	}

	@Override
	public double getSpeed(){ return speed; }
}