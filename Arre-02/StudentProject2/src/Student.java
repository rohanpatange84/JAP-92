public class Student{

	private static int idgen=1;
	private int id;
	private String name;
	int marks[]=new int[5];


	public Student (String name){
		this.name=name;
		id=idgen++;
	}


	public void setMark(int index,int marks){
		this.marks[1]=marks;
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