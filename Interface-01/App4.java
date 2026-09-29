interface Principal{
	void f1();
}

interface HOD extends Principal{
	void f2();
}

abstract class Cleark{

	public void f3(){
		System.out.println("I am cleark ::");
	}

	abstract void f4();
}
class Student extends Cleark implements HOD,Principal{
	void msg(){
		System.out.println("I am student ::");
	}
	@Override
	public void f2(){
		System.out.println("I am HOD ::");
	}

	@Override 
	public void f1(){
		System.out.println("I am Principal ::");
	}

	@Override
	public void v4(){
		System.
	}
}

public class App4{
	public static void main(String[] args){

		Principal p1 = new Student();
		p1.f1();
		// p1.f2();
		// p1.msg();

		HOD p2 = new Student();
		p2.f1();
		p2.f2();
		// p2.msg();

		Student s1= new Student();
		s1.f1();
		s1.f2();
		s1.msg();


		
	}
}