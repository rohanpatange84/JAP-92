import java.util.Scanner;
class Student{

	private static int idgen=1;
	private int id;
	private String name;
	private int marks[]=new int[5];


	public Student (String name){
		this.name=name;
		id=idgen++;
	}


	public void setMark(int marks[]){
		for(int i=0;i<marks.length;i++){
			this.marks[i]=marks[i];
		}
		
	}

	public String getName(){
		return this.name;
	}


	public void getMarks(){
		for(int i=0;i<marks.length;i++){
			System.out.println(marks[i]);
		}
	}
}

class App{
	public static void main(String[] args) {

		Student s1[]=new Student[3];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<s1.length;i++){
			System.out.print("Enter name: ");
			String name=sc.nextLine();
			s1[i]=new Student(name);

		}

		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i].getName());
		}


		int mark[]=new int[]{10,20,30,40,50};

		
			s1[0].setMark(mark);


			s1[0].getMarks();



		
		
	}
}