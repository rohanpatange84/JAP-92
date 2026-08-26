public class App{
	public static void main(String[] args) {
		Employee e1=new Employee(1,"Suraj","Thite",35000);


		System.out.println("ID : "+e1.getID());
		e1.getFirstName();
		e1.getLastName();
		e1.getName();
		System.out.println("Salary : "+e1.getSalary());

		e1.setSalary(50000);

		System.out.println("ID : "+e1.getID());
		e1.getFirstName();
		e1.getLastName();
		e1.getName();
		System.out.println("Salary : "+e1.getSalary());

		System.out.println("Aual Salary : "+e1.getAnnualSalary());

		System.out.println("Increment Salary : "+e1.raiseSalary(10));
	}
}