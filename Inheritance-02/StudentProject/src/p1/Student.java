package p1;
import java.util.Scanner;
public class Student{
	private String name;
	private String address;
	private int numCourses;
	private String courses[]=new String[10];
	private int grades[]=new int[10];

	public Student(String name, String address){
		this.name=name;
		this.address=address;
	}

	public String getName(){
		return name;
	}

	public String getAddress(){
		return address;
	}

	public void setName(String name){
		this.name=name;
	}

	public void setAddress(String address){
		this.address=address;
	}

	public void addCourseGrade(String courses[],int grades[]){
		for(int i=0;i<courses.length;i++){
			this.courses[i]=courses[i];
			this.grades[i]=grades[i];
		}
	}

	public double getAverageGrade(){
		double res;
		int sum=0;
		for(int i=0;i<grades.length;i++){
			sum=sum+grades[i];
		}

		res=sum%grades.length;
		 return res;

	}

	public void printGrade(){
		for(int i=0;i<grades.length;i++){
			System.out.print(grades[i]+" ");
		}
		System.out.println();
	}
}