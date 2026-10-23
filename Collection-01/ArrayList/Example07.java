import java.util.List;
import java.util.ArrayList;


class Student{

	int roll;
	String name;
	int mark;

	public Student(int roll, String name, int mark){
		this.roll=roll;
		this.name=name;
		this.mark=mark;

	}
	public Student (){}


	public String toString(){
		return String.format("%-3d %-4s %-3d",roll,name,mark);
	}



}


public class Example07{
	public static void main(String[] args) {

		Student st[]=new Student[5];

		for(int i=0;i<5;i++){
			st[i]=new Student(i,"Suraj",70);
		}

		System.out.println(st[1].toString());

		List<Student> list = new ArrayList<>();

		for(int i=0;i<st.length;i++){
			list.add(st[i]);
		}

		System.out.println(list);

		System.out.println(list.size());
		

	}
}