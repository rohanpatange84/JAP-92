package p1;

import p2.Student;
import p3.Marks;

public class App{
	public static void main(String[] args) {
			Marks m1=new Marks(86,89,75,89,65);
		Student s1=new Student(14,"Roohan Patange",m1);
	

		s1.getInfo();
		
	}
}