public class Student{
	private static int getid=1;
	private int id;
	private String name;
	private int marks;

	Student(String name,int marks){
		this.name=name;
		this.marks=marks;
		id=getid++;
	}

		//getter
		public String getName(){
			return this.name;
		}
		public int getMarks(){
			return this.marks;
		}
		

		//setter
		public void setName(String name){
			this.name=name;
		}

		public void setMarks(int marks){
			this.marks=marks;
		}

		//get information
		public  void getInfo(){
			System.out.printf("%-3d %-10s %-4d",id,name,marks);
			System.out.println();


		}
}