import java.util.Random;
class Employee{
	private int id;
	private String firstname;
	private String lastname;
	private double salary;

	//constructor
	Employee(){
		this("Rohan","Patange",50000);

	}

	Employee(String firstname,String lastname,double salary){
		this.firstname=firstname;
		this.lastname=lastname;
		this.salary=salary;
		id=idGenerator();

    }

	Random random =new Random();

	private int  idGenerator(){
		id =0;
		while(true){
			id=random.nextInt(1000);
			if(id%2==0) break;
		}
		return id;
	}

	

	public String getName(){
			return firstname +" "+ lastname;

		}

	public int getId(){
		return id;
	}
	public double getSalary(){
		return salary;
	}
	
}

public class App1{
	public static void main(String[] args) {

		Employee e1 =new Employee();
		Employee e2=new Employee("Dinesh","Arekar",60000);
		Employee e3= new Employee("Tony", "Stark",90000);

		

		System.out.println("-----------------");

		System.out.println(e3.getName());

		System.out.println(e3.getSalary());

		System.out.println("ID: "+e3.getId());




		
	}
}