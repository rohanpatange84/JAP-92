package user;

import java.util.TreeSet;
import p2.Student;
public class App {
	public static void main(String[] args) {
		
		Student s1 = new Student(11,"Rahul",89);
		Student s2 = new Student(12,"Kunal",87);
		Student s3 = new Student(13,"Rahul",89);
		Student s4 = new Student(11,"Pavan",88);
		Student s5 = new Student(15,"Rahul",89);
		Student s6 = new Student(13,"Vishal",74);
		
		TreeSet<Student> list = new TreeSet<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
	
		
		for(Student st:list) {
			System.out.println(st);
		}
		
		
		
 	}
}
