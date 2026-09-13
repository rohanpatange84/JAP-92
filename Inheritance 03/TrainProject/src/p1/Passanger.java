package p1;

public class Passanger{
	private static int passangerId;
	private String name;
	private int age;
	private char gender;

	public Passanger(){
		this("",-1,' ');
		

	}

	public Passanger(String name, int age, char gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
		passangerId++;

	}


	//getter 
	public String getName(){ return name; }

	public int getAge(){ return age; }

	public char getGender(){ return gender; }


	//setter
	public void setName(String name){
		this.name=name;
	}

	public void setAge(int age){
		this.age=age;
	}

	public void setGender(char gender){
		this.gender=gender;
	}

	public void getPassager(){
		System.out.println("Passanger Id: "+passangerId);
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Gender: "+gender);
	}
}