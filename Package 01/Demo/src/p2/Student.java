package p2;

import p3.Marks;

public class Student{
	private int id;;
	private String name;
	private Marks mark;


	public Student(int id,String name,Marks mark){
		this.id=id;
		this.name=name;
		this.mark=mark;
	}

	public void getInfo(){
		System.out.println("ID: "+this.id);
		System.out.println("Name: "+this.name);
		System.out.println("Totalmarks: "+mark.getTotal());
		

	}
}