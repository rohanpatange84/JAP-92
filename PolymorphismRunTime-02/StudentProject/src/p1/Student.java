package p1;

public class Student{
	private String name;
	private int rollNo;
	private int marks[]=new int[6];


	public Student(String name){
		this.name=name;
	}

	public Student(String name, int rollNo, int marks[]){
		this.name=name;
		this.rollNo=rollNo;
		for(int i=0;i<marks.length;i++){
			this.marks[i]=marks[i];
		}
	}

	public Student(String name,int rollNo){
		this.name=name;
		this.rollNo=rollNo;
	}

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


	//getter 
	public String getName(){
		return name;
	}

	public int getRollNo(){
		return rollNo;
	}

	public int[] getMarks(){
		return marks;
	}

	//methods

	public int getTotalMarks(){
		int total=0;
		for(int i=0;i<marks.length;i++){
			total=total+marks[i];
		}
		return total;
	}
	
	public double getAverage(){
		double total=getTotalMarks();
		double avg=total/marks.length;

		return avg;
	}

	public void getStudent(){
		System.out.println("Name: "+name);
		System.out.println("Roll No.: "+rollNo);
		System.out.print("Marks: ");
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}
}