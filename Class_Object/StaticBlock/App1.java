class Students{

	//instance variable
	private String name;
	private int rollno;


	//static variable
	static String college;
	static int fees;


	//instance block
	{
		name="XYZ";
		rollno=1;

	}
	
	//constructor
	Students(String name,int rollno){
		System.out.println("Constructor insitializer");
		System.out.println("Name:"+this.name);
		System.out.println("------------------");
		this.name=name;
		this.rollno=rollno;
		System.out.println("Name:"+this.name);

	}
	Students(){

		System.out.println("Constructor without insiliizer");


	}

	//non-static method
	public void showData(){
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
		System.out.println("College: "+college);
		System.out.println("Fees: "+fees);
	}


	//static method
	static void displayData(){

		// System.out.println("Name: "+name);
		// System.out.println("Roll no: "+rollno);
		System.out.println("College: "+college);
		System.out.println("Fees: "+fees);
	}


		//static block
	static{
		System.out.println("Static block");
		college="BNCOE";
		fees=96500;
	}
}
public class App1{
	public static void main(String[] args) {
		Students s2=new Students("Rohan",57);
		Students s1=new Students();
		

		s1.showData();
		s2.showData();
		

		// s1.displayData();



		
	}
}