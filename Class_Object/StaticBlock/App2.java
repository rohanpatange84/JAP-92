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

		Mobile m = new Mobile();
		Mobile m1= new Mobile("6gb","128gb","white",1600);
		Mobile m2= new Mobile("8gb","128gb","green",17000);
		Mobile m3= new Mobile("8gb","256gb","green",18000);

		m.getMobile();

		System.out.println("-----------------------");
		
		m1.getMobile();

		System.out.println("-----------------------");
		
		m2.getMobile();

		System.out.println("-----------------------");
		
		m3.getMobile();
	}
}