package user;
import util.Student;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;

public class App {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static Student addStudent() {
		
		System.out.println("Enter ID : ");
		int id = sc.nextInt();
		
		System.out.println("Enter Name: ");
		String name = sc.next();
		
		System.out.println("Enter Marks : ");
		double marks = sc.nextDouble();
		
		return new Student(id,name,marks);
	}
	
	public static  void displayStudents(ArrayList<Student> list) {
		System.out.println("-------------------------");
		String s=String.format("%-3s %-10s %3s","ID","Name","Marks");
		System.out.println(s);
		System.out.println("-------------------------");
		Iterator<Student> ite = list.iterator();
		while(ite.hasNext()) {
			System.out.println(ite.next());
		}
		System.out.println("-------------------------");
		
		
	}
	
	public static Student searchById(int id,ArrayList<Student> list) {
		
		for(int i=0;i<list.size();i++) {
			Student s1= list.get(i);
			if(s1.getId()==id)
				return s1;
		}
		
		return null;
		
		
	}
	

public static Student searchById(String name,ArrayList<Student> list) {
	
	for(int i=0;i<list.size();i++) {
		Student s1= list.get(i);
		if(s1.getName().equals(name))
			return s1;
	}
	
	return null;
	
	
}

public static void removeStudent(ArrayList<Student> list,int id){
	
	for(int i=0;i<list.size();i++) {
		Student s1= list.get(i);
		if(s1.getId()==id)
			list.remove(i);
	}
	
			
	
	
}
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<>();
		
		for(int i=1;i<=3;i++) {
			students.add(addStudent());
		}
		
		
		displayStudents(students);
		
		
		
		Student st = searchById(11,students);
		
		System.out.println(st);
		
		removeStudent(students,11);
		
		displayStudents(students);
		
		
		
		
		
	}
	

	
	


}
