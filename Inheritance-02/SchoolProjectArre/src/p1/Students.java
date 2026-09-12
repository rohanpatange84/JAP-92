package p1;

public class Students extends Person{
	private String program;
	private int year;
	private double fee;


	public Students(String name,String address,String program,int year ,double fee){
		super.setName(name);
		super.setAddress(address);
		this.program=program;
		this.year=year;
		this.fee=fee;

	}
	//getter
	public String getProgram(){
		return program;
	}

	public int getYear(){
		return year;
	}

	public double getFee(){
		return fee;
	}

	public void setProgram(String program){
		this.program=program;

	}

	public void setYear(int year){
		this.year=year;

	}

	public void setFee(double fee){
		this.fee=fee;
	}



	public void studentsInfo(){
		System.out.println("Name: "+super.getName());
		System.out.println("Address: "+super.getAddress());
		System.out.println("Program: "+program);
		System.out.println("Year: "+year);
		System.out.println("Fee: "+fee);
	}






}
