package p2;

	


public class ElectricCar extends Car{
	private int batteryPercentage;

	public ElectricCar(String brand, double speed){
		super(brand,speed);
	}

	@Override
	public void start(){
		System.out.println("ElectricCar Start ::");
	}

	@Override 
	public void stop(){
		System.out.println("ElectricCar Stop");
	}


}