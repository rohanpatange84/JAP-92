package user;

import util.Student;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import java.util.ArrayList;
import java.util.Iterator;

public class App {

	private static Scanner sc = new Scanner(System.in);

	public static void addStudent(ArrayList<Student> list) {

		System.out.println("Enter ID : ");
		int id = sc.nextInt();

		System.out.println("Enter Name: ");
		String name = sc.next();

		System.out.println("Enter Marks : ");
		double marks = sc.nextDouble();

		Student std = new Student(id, name, marks);
		list.add(std);
	}

	public static void displayStudents(ArrayList<Student> list) {
		System.out.println("----------------------------");
		String s = String.format("%-5s %-10s %3s", "ID", "Name", "Marks");
		System.out.println(s);
		System.out.println("----------------------------");
		Iterator<Student> ite = list.iterator();
		while (ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("----------------------------");

	}

	public static void searchById(int id, ArrayList<Student> list) {
		boolean light = false;
		for (int i = 0; i < list.size(); i++) {
			Student s1 = list.get(i);
			if (s1.getId() == id) {
				light = true;
				System.out.println("--------------------------------------------");
				System.out.println("With ID: " + id + " Student present at index: " + i);
				System.out.println(s1);
				System.out.println("--------------------------------------------");
				break;
			}
		}
		if (light == false) {
			System.out.println("--------------------------------------------");
			System.out.println("Student not exist with ID: " + id);
			System.out.println("--------------------------------------------");
		}

	}

	public static Student searchById(String name, ArrayList<Student> list) {

		for (int i = 0; i < list.size(); i++) {
			Student s1 = list.get(i);
			if (s1.getName().equals(name))
				return s1;
		}

		return null;

	}

	public static void removeStudent(ArrayList<Student> list, int id) {

		Student s = null;
		for (int i = 0; i < list.size(); i++) {
			Student s1 = list.get(i);
			if (s1.getId() == id) {
				s = list.get(i);
				list.remove(i);
			}
		}

		System.out.println("Student removed with ID: " + id);
		System.out.println(s);

	}

	public static void updateStudent(ArrayList<Student> list, int id) {

		for (int i = 0; i < list.size(); i++) {
			Student s1 = list.get(i);
			if (s1.getId() == id)
				System.out.println("Enter id: ");
			s1.setId(sc.nextInt());
			System.out.println("Enter Name: ");
			s1.setName(sc.next());
			System.out.println("Enter Marks: ");
			s1.setMarks(sc.nextDouble());
			break;
		}

	}

	public static void main(String[] args) {

		Student s1 = new Student(101, "Rahul", 85.5);
		Student s2 = new Student(102, "Priya", 92.0);
		Student s3 = new Student(103, "Amit", 76.5);
		Student s4 = new Student(104, "Sneha", 88.0);
		Student s5 = new Student(105, "Pavan", 95.5);

		ArrayList<Student> students = new ArrayList<>();
		boolean light = true;

		students.add(s1);
		students.add(s2);
		students.add(s3);
		students.add(s4);
		students.add(s5);

//		
//		for(int i=1;i<=3;i++) {
//			students.add(addStudent());
//		}
//		

//		displayStudents(students);
//		
//		
//		
//		Student st = searchById(11,students);
//		
//		System.out.println(st);
//		
//		removeStudent(students,11);
//		
//		displayStudents(students);

		int n;

		do {
//			displayStudents(students);

			System.out.println("Enter 1 --- Add Student");
			System.out.println("Enter 2 --- Remove Student");
			System.out.println("Enter 3 --- Search student");
			System.out.println("Enter 4 --- Display Students");
			System.out.println("Enter 5 --- Update Student");
			System.out.println("Enter 6 --- Exit");
//			
			n = sc.nextInt();

			switch (n) {
			case 1:
				addStudent(students);
				break;

			case 2:
				System.out.println("Enter id of the student:");
				int id = sc.nextInt();
				removeStudent(students, id);
				break;

			case 3:
				System.out.println("Enter ID");
				int id1 = sc.nextInt();
				searchById(id1, students);
				break;

			case 4:
				displayStudents(students);
				break;

			case 5:
				System.out.println("Enter Id: ");
				int id2 = sc.nextInt();
				updateStudent(students,id2);
				break;

			case 6:
				light = false;
				break;

			default:
				System.out.println("Invalid input....!");
				break;
			}
		} while (light);

	}

}
