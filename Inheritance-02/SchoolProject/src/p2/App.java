package p2;

import p1.Person;
import p1.Staff;
import p1.Students;

public class App{
	public static void main(String[] args) {
		Students s1=new Students("Rohan","Hingoli","JAP-92",2026,47000);
		Staff stf=new Staff("XYZ","Pune","Vibrant Mind",85000);

		s1.studentsInfo();
		System.out.println("----------------");
		stf.staffInfo();

		s1.setName("Pavan");
		stf.setName("Dinesh");
		System.out.println("----------------");

		s1.studentsInfo();
		System.out.println("----------------");
		stf.staffInfo();
	}
}