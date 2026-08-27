class Student{
	private String name;
	private int rollno;
	static String collage="BNCOE";

	public Student(){

	}

	public Student(String name,int rollno){
		this.name=name;
		this.rollno=rollno;

	}

	public void getDetail(){
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollno);
		System.out.println("Name: "+collage);

	}


}



public class Demo{
	public static void main(String[] args) {

		Student s1=new Student();
		s1.collage="zp";
		s1.getDetail();


		Student	s2=new Student("Suraj",20);
		s2.getDetail();
		
	}
}