public class App{
	public static void main(String[] args) {
		Manager m1=new Manager();

		m1.setName("Rohan");
		m1.setSalary(50000);

		m1.setDepartment("IT");

		m1.displayEmployee();
		m1.displayDepartment();
	}
}