package p1;

public class SportStudent extends Student{
	private String sport;
	private int soprtMarks;


	public SportStudent(String name, int rollNo, int marks[],String sport,int soprtMarks){
		super(name, rollNo, marks);
		this.sport=sport;
		this.soprtMarks=soprtMarks;
	}

	//setter

	public void setSport(String sport){
		this.sport=sport;
	}

	public void setSportMark(int soprtMarks){
		this.soprtMarks=soprtMarks;
	}

	//getter

	public String getSport(){
		return sport;
	}

	public int getSportMarks(){
		return soprtMarks;
	}

	//methids

	public int getTotalMarks(){
		int total=super.getTotalMarks();
		
		return total+getSportMarks();
	}

	public double getAverage(){
		double total=getTotalMarks();
		double avg=total/super.getMarks().length;

		return avg;
	}

	public void getStudent(){
		System.out.println("Name: "+super.getName());
		System.out.println("Roll No.: "+super.getRollNo());
		System.out.println("Sport: "+sport);
		System.out.print("Marks: ");
		int marks[]=super.getMarks();
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		System.out.println("Sport Bonous marks: "+soprtMarks);
	}

}