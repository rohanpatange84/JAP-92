public class Person{
	private String name;
	private int age;
	private String phone;


	//setter
	public void setName(String name){
		this.name=name;

	}

	public void setAge(int age){
		this.age=age;
		
	}

	public void setPhone(String phone){
		this.phone=phone;
		
	}


	//getter
	public String getName(){
		return name;
	}

	public int getAge(){
		return age;
	}
	public String getPhone(){
		return phone;
	}


	//methods
	public void displayPerson(){
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Phone: "+phone);
	}

}