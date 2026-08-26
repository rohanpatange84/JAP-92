public class Employee{
	private int id;
	private String firstName;
	private String lastName;
	private int salary;


	public Employee(int id,String firstName, String lastName,int salary){
		this.id=id;
		this.firstName=firstName;
		this.lastName=lastName;
		this.salary=salary;

	}

	public int getID(){
		return id;
	}

	public void getFirstName(){
		System.out.println("First Name : "+firstName);

	}

	public void getLastName(){
		System.out.println("Last Name : "+lastName);
	}

	public void getName(){
		System.out.println("Name : "+firstName+" "+lastName);
	}

	public int getSalary(){
		return salary;
	}

	public void setSalary(int salary){
		this.salary=salary;
	}

	public int getAnnualSalary(){
		return salary*12;
	}

	public double raiseSalary(int percent){
		double newsalary=salary+(percent/100.0*salary);
		return newsalary;

	}

}