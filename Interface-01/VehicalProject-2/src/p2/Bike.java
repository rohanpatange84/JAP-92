package p2;

import p1.Vehicle;

public class Bike extends VehicleDetails implements Vehicle{
	private String engineCC;

	public Bike(){ }

	public Bike(String engineCC){
		this.engineCC=engineCC;
	}

	public String getEnginecc(){ return engineCC; }

	public void setEnginecc(String engineCC){
		this.engineCC=engineCC;

	}

	public Bike(String brand, int price, String engineCC){
		super(brand,price);
		this.engineCC=engineCC;
	}

	@Override
	public void start(){
		System.out.println("Bike Start ::");
	}
	
	@Override
	public void stop(){
		System.out.println("Bike stop ::");
	}

	@Override
	public void displayDetails(){
		System.out.println("------Bike Details------");
		System.out.println("Brand: "+super.getBrand());
		System.out.println("Price: "+super.getPrice());
		System.out.println("EngineCC: "+engineCC);
	}


}