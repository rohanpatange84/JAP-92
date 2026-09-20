package p1;

public class Chef{
	private String name;
	private String specialty;

	public Chef(String name, String specialty){
		this.name=name;
		this.specialty=specialty;
	}


	public void cook(){
		System.out.println("Chef "+name+" is cooking "+specialty+" food");
	}
}