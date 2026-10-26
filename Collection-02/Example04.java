

import java.util.ArrayList;
import java.util.List;

class Student{
	int rollno;
	String name;
	int marks;
	
	public Student(int rollno, String name, int marks) {
		this.rollno=rollno;
		this.name=name;
		this.marks=marks;
		
	}
	
	public Student() {}
	
	@Override
	public String toString() {
		return "RollNo :"+rollno+"  Name :"+name+"  Mark :"+marks;
	}
	
}
public class Example04 {
	public static void main(String[] args) {
		
		Student str[]= new Student[5];
		
		for(int i=0;i<str.length;i++) {
			str[i]=new Student(i+1,"Shrenath"+(i+1)+"",88+i);
		}
		
		
		List<Student> list = new ArrayList();
		
		for(int i=0;i<str.length;i++) {
			list.add(str[i]);
		}
		
		
		System.out.println(list);
		
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
		
	}
}
