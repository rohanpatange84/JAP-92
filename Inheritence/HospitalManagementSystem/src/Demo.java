
class Student{
	private String name;
	int age;

 Student(String name , int age){
 	this.name=name;
 	this.age=age;


 }

 String getName(){
 	return name;
 }

 void setName(String name){
 	this.name=name;
 }



}

public class Demo{
	public static void main(String[] args) {
		Student s1=new Student("Rohan",23);

		s1.setName("ABC");

		String n=s1.getName();
		System.out.println(n);
		
	}
}