package p2;

import java.util.Iterator;
import p1.Employee;
import java.util.ArrayList;
import java.util.List;
public class App {
	
public static void lowestSalaryEmp(ArrayList<Employee> employees) {
		Employee demo=employees.get(0);
		double max=demo.getSalary();
		
		Employee emp=null; 
		for(int i =0;i<employees.size();i++) {
			emp=employees.get(i);
			if(max>emp.getSalary()) {
				max=emp.getSalary();
			}
		}
		
		
		
		for(int i =0;i<employees.size();i++) {
			emp=employees.get(i);
			if(max==emp.getSalary()) {
				System.out.println(emp);
				break;
			}
		}
	
		
	}
	
	
	public static void higherSalaryEmp(ArrayList<Employee> employees) {
		
		double max=0;
		Employee emp=null; 
		for(int i =0;i<employees.size();i++) {
			emp=employees.get(i);
			if(max<emp.getSalary()) {
				max=emp.getSalary();
			}
		}
		
		
		
		for(int i =0;i<employees.size();i++) {
			emp=employees.get(i);
			if(max==emp.getSalary()) {
				System.out.println(emp);
				break;
			}
		}
	
		
	}
	
	public static void findEarnimgMoreThan(ArrayList<Employee> employees, int earn) {
		Employee emp=null; 
		for(int i =0;i<employees.size();i++) {
			emp=employees.get(i);
			if(emp.getSalary()>earn) {
				System.out.println(emp);
			}
		}
		
	}
	
	
	
	public static void belongToDepart(ArrayList<Employee> employees, String depart) {
		Employee emp=null; 
		for(int i =0;i<employees.size();i++) {
			emp=employees.get(i);
			if(emp.getDepartment().equals(depart)) {
				System.out.println(emp);
			}
		}
		
	}
	
	
	public static void displayAllEmployee(ArrayList<Employee> employees) {
		System.out.println("-------------------------------------");
		System.out.println(String.format("%-5s %-8s %-8s %-5s", "ID","Name","Depart.","Salary"));
		System.out.println("-------------------------------------");
		Iterator<Employee> itr = employees.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		System.out.println("-------------------------------------");
		
	}
	
		public static void main(String[] args) {
			
			 ArrayList<Employee> employees = new ArrayList<>();

		        employees.add(new Employee(101, "Rahul", "IT", 55000));
		        employees.add(new Employee(102, "Priya", "HR", 45000));
		        employees.add(new Employee(103, "Amit", "IT", 75000));
		        employees.add(new Employee(104, "Sneha", "Finance", 60000));
		        employees.add(new Employee(105, "Karan", "IT", 65000));
		        employees.add(new Employee(106, "Neha", "HR", 50000));
		        employees.add(new Employee(107, "Rohit", "Finance", 70000));
		        
		        
		        
		        displayAllEmployee(employees);
		        
		        belongToDepart(employees,"IT");
		        
		        System.out.println("----------------------------");
		        
		        findEarnimgMoreThan(employees,60000);
		        
		        System.out.println("----------------------------");
		        
		        higherSalaryEmp(employees);
		        
		        System.out.println("-----------------------------");
		        
		        lowestSalaryEmp(employees);
		        
		        
		        


		}
}
