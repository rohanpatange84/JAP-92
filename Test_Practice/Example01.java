class Student{

	private String name;
	private int rollNo;
	private int marks[]=new int[6];

	public Student(){}

	public Student(String name, int rollNo, int marks[]){
		this.name=name;
		this.rollNo=rollNo;
		for(int i=0;i<marks.length;i++){
			this.marks[i]=marks[i];
		}
	}

	//getter
	public String getName(){ return name; }
	public int getRollNo(){ return rollNo; }
	public int[] getMarks(){ return marks; }

	//setter
	public void setName(String name){
		this.name=name;
	}

	public void setRollNo(int rollNo){
		this.rollNo=rollNo;
	}

	public void setMarks(int marks[]){
		for(int i=0;i<marks.length;i++){
			this.marks[i]=marks[i];
		}
	}

	public void displayStudent(){
		System.out.println("Name: "+name);
		System.out.println("Roll No: "+rollNo);
		System.out.print("Marks: ");
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}




}

public class Example01{
	public static void main(String[] args) {

		int marks[]=new int[]{95,96,94,98,93,99};

		Student s1 = new Student("Suraj",45,marks);

		System.out.println(s1.getName());
		System.out.println(s1.getRollNo());

		for(int i=0;i<s1.getMarks().length;i++){
			System.out.print(s1.getMarks()[i]+" ");
		}
		System.out.println();

		System.out.println("---------------------");

		s1.setName("Suraj Thite");
		s1.setRollNo(90);

		int newMark[]={10,20,30,40,50,60};

		s1.setMarks(newMark);

		s1.displayStudent();


		
	}
}