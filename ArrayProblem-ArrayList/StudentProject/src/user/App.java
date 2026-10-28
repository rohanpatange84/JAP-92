package user;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.Iterator;


import p1.Student;

public class App {
	private static Scanner sc =new Scanner(System.in);
	
	public static void addStudent(LinkedList<Student> list) {
		System.out.println("Enter StudentId: ");
		int studentid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Student Name: ");
		String studentname=sc.nextLine();
		
		double marks[] = new double[5];
		
		for(int i=0;i<marks.length;i++) {
			System.out.println("Enter Marks of "+(i+1)+" Sub: ");
			double mark=sc.nextDouble();
			marks[i]=mark;
		}
		
		Student s1 = new Student(studentid,studentname,marks);
		list.add(s1);
		
	}
	
	public static Student searchStudent(LinkedList<Student> list,int studentId) {
		
		for(int i=0;i<list.size();i++) {
			Student s1 = list.get(i);
			if(s1.getStudentId()==studentId) {
				return s1;
			}
		}
		
		return null;
	}
	
	public static void updateMarks(LinkedList<Student>list , int studentId) {
		for(int i=0;i<list.size();i++) {
			Student s1 = list.get(i);
			if(s1.getStudentId()==studentId) {
				double marks[] = new double[5];
				for(int i=0;i<marks.length;i++) {
					System.out.println("Enter Marks of "+(i+1)+" Sub: ");
					double mark=sc.nextDouble();
					marks[i]=mark;
				}
				
				s1.setMarks(marks);
				break;
			}
		}
	}
	
	public static void deletStudent(LinkedList<Student>list , int studentId ) {
		
		Student s1 = searchStudent(LinkedList<Student>list , int studentId);
		
		list.remove(s1);
		
	}
	
	public static Student hightMarkStudent(LinkedList<Student>list) {
		
		Student s2 = null;
		int mark=0;
		for(int i=0;i<list.size();i++) {
			Student s1 = list.get(i);
			double marks[]=s1.getMarks();
			int sum;
			for(int i=0;i<marks.length;i++) {
				sum+=marks[i];
			}
			if(mark<sum) {
				mark=sum;
				s2=s1;
			}
		}
		return s2;
		
	}
	
	public static void diaplayStudent(LinkedList<Student> list) {
		Iterator<Student> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		
	}
	public static void main(String[] args) {
		double marks[]= {90,88,87,98,86};
		double marks2[]= {96,85,97,78,88};
		Student s1 = new Student(101,"Rohan Patange",marks);
		Student s2 = new Student(102,"Suraj Thite",marks2);
		
		LinkedList<Student> list = new LinkedList<>();  
		
		list.add(s1);
		list.add(s2);
		
		diaplayStudent(list);
		addStudent(list);
		diaplayStudent(list);
		
		
		
		
	}

}
