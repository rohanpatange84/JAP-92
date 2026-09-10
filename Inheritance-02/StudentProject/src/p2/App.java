package p2;
import java.util.Scanner;
import p1.Student;



public class App{


public static int[] generateGrade(){
	int grades[]=new int[10];
	Scanner sc =new Scanner(System.in);
	for(int i=0;i<grades.length;i++){
		System.out.println("Enter grade "+(i+1)+":");
		grades[i]=sc.nextInt();

	}
	return grades;
}

	public static void main(String[] args) {
		Student s1=new Student("Rohan","Pune");


		System.out.println(s1.getName());
		System.out.println(s1.getAddress());

		s1.printGrade();

		String course[]=new String[10];
		int grades[]=new int[10];

		s1.addCourseGrade(course,generateGrade());

		s1.printGrade();


		System.out.println(s1.getAverageGrade());

	}
}