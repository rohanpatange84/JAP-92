public class Employee{
	private String name;
	private double salary;

	public void displayEmployee(){
		System.out.println("Name: "+name);
		System.out.println("Salary: "+salary);
	}

	public void setName(String name){
		this.name=name;

	}

	public  void setSalary(double salary){
		this.salary=salary;
	}


}