public class Student{
	private static int studentId=1;
	String studentName;
	double marks[]=new int[5];


	public Student(int studentName){
		this.studentName=studentName;
		studentId++;
	}

	public void setMarks(int marks[]){
		for(int i=0;i<this.marks.length;i++){
			this.marks[i]=marks[i];

		}
	}

	public int avgMark(){
		int sum=0;
		for(int i=0;i<this.marks.length;i++){
			sum=sum+marks[i];
		}
		System.out.println("Average marks :"+sum);
		return sum;
	}

	public void getStudent(){
		System.out.println(this.studentId);
		System.out.println(this.studentName);
	}

	public int getTopper(){

			int avg=avgMark();
			return avg;


	}
}