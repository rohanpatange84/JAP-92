package p1;

public class Staff extends Person{
	private String school;
	private double pay;

	public Staff(String name,String address,String school,double pay){
		super.setName(name);
		super.setAddress(address);
		this.school=school;
		this.pay=pay;
	}

	public String getSchool(){
		return school;
	}

	public double getPay(){
		return pay;
	}

	public void setSchool(String school){
		this.school=school;
	}

	public void setPay(double pay){
		this.pay=pay;
	}


	public void staffInfo(){
		System.out.println("Name: "+super.getName());
		System.out.println("Address: "+super.getAddress());
		System.out.println("School: "+school);
		System.out.println("Pay: "+pay);
		
	}

}