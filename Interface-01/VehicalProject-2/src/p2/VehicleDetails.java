package p2;





public abstract class VehicleDetails{
	private String brand;
	private int price;

	public VehicleDetails(){ }

	public VehicleDetails(String brand, int price){
		this.brand=brand;
		this.price=price;
	}




	// getter
	public void setBrand(String brand){
		this.brand=brand;
	}

	public void setPrice(int price){
		this.price=price;
	}

	//
	public String getBrand(){ return brand; }

	public int getPrice(){ return price; }

	public abstract void displayDetails();


}