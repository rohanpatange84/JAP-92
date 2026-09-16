package p2;

import java.util.Scanner;
import p1.Student;
import p1.SportStudent;

public class App{

	public static int[] getMarks(){
		int marks[]=new int[6];
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<marks.length;i++){
			System.out.println("Enter marks "+(i+1)+":");
			marks[i]=sc.nextInt();
		}
		return marks;

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String name;
		int rollNum;
		String sport;
		int sportmarks;

		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter roll num:");
		rollNum=sc.nextInt();

		Student s1 = new Student(name,rollNum,getMarks());
		sc.nextLine();
		System.out.println("Enter your name:");
		name=sc.nextLine();
		System.out.println("Enter roll num:");
		rollNum=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter sport:");
		sport=sc.nextLine();
		System.out.println("Enter sport marks:");
		sportmarks=sc.nextInt();

		
		SportStudent sp1= new SportStudent(name,rollNum,getMarks(),sport,sportmarks);

		s1.getStudent();
		System.out.println();
		 sp1.getStudent();

		 System.out.println("Total marks: "+s1.getTotalMarks());
		 System.out.println("Total marks: "+sp1.getTotalMarks());

		 System.out.println("Average: "+s1.getAverage());
		 System.out.println("Average: "+sp1.getAverage());
	}
}