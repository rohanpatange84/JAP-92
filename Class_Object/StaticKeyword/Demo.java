class Student{
	private String name;
	private static int rollno;
	



	public Student(String name){
		rollno++;
		this.name=name;
		
	

	}


	public void getDetail(){
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollno);
		

	}


}



public class Demo{
	public static void main(String[] args) {

		

		Student s1=new Student("Tushr");
		s1.getDetail();

		Student	s2=new Student("Suraj");
		s2.getDetail();

		Student s3=new Student("x");
		s3.getDetail();

		Student	s4=new Student("y");
		s4.getDetail();

		
		
	}
}