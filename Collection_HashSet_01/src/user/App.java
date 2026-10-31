package user;

import p2.Student;
import java.util.HashSet;
import java.util.Iterator;
public class App {
	public static void main(String[] args) {
		Student s1 = new Student(14,"Rohan",89);
		Student s2 = new Student(45,"Suraj",75);
		Student s3 = new Student(14,"Rohan",89);
		Student s4 = new Student(45,"Suraj",75);
		Student s5 = new Student(54,"Dinesh",86);
		Student s6 = new Student(14,"rohan",89);
		
		
		HashSet<Student> list =new HashSet<>();
		list.add(s1);
		list.add(s2);
		list.add(s3);
		list.add(s4);
		list.add(s5);
		list.add(s6);
		
//		System.out.println(list);
		
		Iterator<Student> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		System.out.println(s5.hashCode());
		System.out.println(s6.hashCode());
		
		
	}
}
