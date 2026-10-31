package user;

import p2.Student;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class App {

	private static Scanner sc = new Scanner(System.in);

	public static void addStudent(HashSet<Student> list) {
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Name: ");
		String name = sc.nextLine();
		System.out.println("Enter Marks: ");
		double marks = sc.nextDouble();

		Student s1 = new Student(id, name, marks);
		list.add(s1);

	}

	public static void removeStudent(HashSet<Student> list, int id) {

		for (Student st : list) {
			if (st.getId() == id) {

				list.remove(st);
				break;

			}
		}

	}

	public static void displayStudent(HashSet<Student> list) {

		Iterator<Student> itr = list.iterator();
		String ss=String.format("%-5s %-10s %-5s","ID","Name","Marks");
		System.out.println("------------------------------");
		System.out.println(ss);
		System.out.println("------------------------------");
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("------------------------------");
		
	}
	
	public static void searchStudent(HashSet<Student> list,int id) {
		boolean light=true;
		for(Student st:list) {
			if(st.getId()==id) {
				light=false;
				System.out.println("-----------------------------");
				System.out.println("Student found with id "+id+" ");
				System.out.println(st);
				System.out.println("-----------------------------");
				break;
			}
		}
		if(light) {
			System.out.println("-----------------------------");
			System.out.println("Student not found with id "+id);
			System.out.println("-----------------------------");
		}
		
	}

	public static void main(String[] args) {
		Student s1 = new Student(14, "Rohan", 89);
		Student s2 = new Student(45, "Suraj", 75);
		Student s3 = new Student(14, "Rohan", 89);
		Student s4 = new Student(45, "Suraj", 75);
		Student s5 = new Student(54, "Dinesh", 86);
		Student s6 = new Student(14, "rohan", 89);

		HashSet<Student> list = new HashSet<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);

		boolean light = true;

		do {
			System.out.println("Enter 1-----Add Student");
			System.out.println("Enter 2-----Remove Student");
			System.out.println("Enter 3-----Search Student");
			System.out.println("Enter 4-----Display Student");
			System.out.println("Enter 5-----");

			int n = sc.nextInt();

			switch (n) {

			case 1:
				addStudent(list);
				break;

			case 2:
				System.out.println("Enter id: ");
				int id = sc.nextInt();
				removeStudent(list, id);
				break;

			case 3:
				System.out.println("Enter id: ");
				int id2 = sc.nextInt();
				searchStudent(list,id2);
				break;

			case 4:
				displayStudent(list);
				break;
				
			case 5:
				light=false;
				break;
				
			default:
				break;

			}
			

		} while (light);

	}
}
