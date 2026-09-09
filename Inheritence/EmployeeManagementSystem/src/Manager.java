public class Manager extends Employee{
	private String department;

	public void displayDepartment(){
		System.out.println("Department: "+department);

	}

	public void setDepartment(String department){
		this.department=department;
	}

}