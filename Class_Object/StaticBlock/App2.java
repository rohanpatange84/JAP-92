class Mobile{

	//static variable
	static String model;

	//instance variable
	private String ram;
	private String rom;
	private String colour;
	private int price;

	//static block
	static{
		model="Oppo Reno 2f";

	}

	//instance block
	{
		ram="6gb";
		rom="256gb";
		colour="white";
		price=1800;
	}

	//constructor
	public Mobile(String ram,String rom,String colour,int price){
		this.ram=ram;
		this.rom=rom;
		this.colour=colour;
		this.price=price;

	}

	public Mobile(){

	}


	//getters || methods  
	public void getMobile(){
		System.out.println("Model:"+model);
		System.out.println("Ram:"+ram);
		System.out.println("Rom:"+rom);
		System.out.println("Colour:"+colour);
		System.out.println("Price:"+price);
	}

	//setterr || methods
	public void setMobile(String ram,String rom,String colour,int price){
		this.ram=ram;
		this.rom=rom;
		this.colour=colour;
		this.price=price;

	}






}




public class App2{
	public static void main(String[] args) {
		
	}
}