import java.util.Scanner;
class Student{

	private static int idgen=1;
	private int id;
	private String name;
	private int marks[]=new int[3];

	Scanner sc = new Scanner(System.in);


	public Student (String name,int marks[]){
		this.name=name;
		for(int i=0;i<marks.length;i++){
			this.marks[i]=marks[i];
		}
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
			System.out.print(marks[i]+" ");
		}
		System.out.println();
	}


	//create arr
	public int[] createArr(){
		int mark[]=new int[3];
		for(int i=0;i<mark.length;i++){
			System.out.print("Mark :");
			int marks=sc.nextInt();
			mark[i]=marks;

		}

		return mark;
	}


	public  void getInfo(){
		System.out.printf("%-3d %-10s",id,name);
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i]+" ");
		}

		System.out.println();
	}
}

class App{

	public static int[] createArr(){
		Scanner sc =new Scanner(System.in);
		int mark[]=new int[3];
		for(int i=0;i<mark.length;i++){
			System.out.print("Mark :");
			int marks=sc.nextInt();
			mark[i]=marks;

		}

		return mark;
	}


	public static void main(String[] args) {
		Student s1[]=new Student[3];
		Scanner sc=new Scanner(System.in);

		for(int i=0;i<s1.length;i++){
			System.out.print("Enter name: ");
			String name=sc.nextLine();
			s1[i]=new Student(name,createArr());

		}
		System.out.println("-----------------------");

	


		// System.out.println("Enter num");
		// int n=sc.nextInt();
		// 	s1[n].getInfo();
			
			System.out.printf("%-3s %-10s %-15s","ID","Name","Marks");
			System.out.println();
			for(int i=0;i<s1.length;i++){
				s1[i].getInfo();

			}

			
			
	

		



		
		
	}
}