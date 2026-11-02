package p2;

import p1.Employee;
import java.util.TreeSet;
public class App {
	public static void main(String[] args) {
		Employee e1 = new Employee(1,"IT",60000);
		Employee e2 = new Employee(2,"HR",50000);
		Employee e3 = new Employee(3,"IT",80000);
		Employee e4 = new Employee(4,"HR",70000);
		
		TreeSet<Employee> list = new TreeSet<>();
		
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		
		for(Employee em:list) {
			System.out.println(em);
		}
	}
}
