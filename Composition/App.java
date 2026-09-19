class Student{
	private String name;
	private int rollno;
	 Marks mark;


	{
		name="ABC";
		rollno=-1;
	}

	public Student(){

		Marks mark=new Marks();
		

	}

	public Student(String name, int rollno,Marks mark){
		this.rollno=rollno;
		this.name=name;

		this.mark=mark;


	}

	//setter

	public void setName(String name){
		this.name=name;
	}

	public void setRollNo(int rollno){
		this.rollno=rollno;
	}

	//getter

	public String getName(){ return name; }

	public int getRollNo(){ return rollno; }


	public void showStudent(){
		System.out.println("Name: "+name);
		System.out.println("Roll no: "+rollno);
	}



}

class Marks{
	private int english;
	private int math;
	private int biology;

	{
		english=-1;
		math=-1;
		biology=-1;
	}

	public Marks(){};

	public Marks(int english,int math,int biology){
		this.english=english;
		this.math=math;
		this.biology=biology;
	}

	//setter
	public void setEnglish(int english){
		this.english=english;
	}

	public void setMath(int math){
		this.math=math;
	}

	public void setBiology(int biology){
		this.biology=biology;
	}


	//getter

	public int getEnglish(){ return english; }

	public int getMath(){ return math; }

	public int getBiology(){ return biology; }


	public void showMarks(){
		System.out.println("English: "+english);
		System.out.println("Math: "+math);
		System.out.println("Biology: "+biology);
	}


}


public class App{
	public static void main(String[] args) {

		Marks m1 = new Marks(90,80,90);

		Student s1 = new Student("Rohan",14,m1);

		Student s2 = new Student(m1);

		s2.showStudent();

		s2.mark.showMarks();


		
	}
}