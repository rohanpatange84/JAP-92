//parent class | super class
class A{
	int x=10;

	void getX(){
		System.out.println("X: "+x);
	}
}


// child class | sub class
class B extends A{
	int y=20;

	void getY(){
		System.out.println("Y: "+y);
	}
}


public class Ex1{
	public static void main(String[] args){

		B b1= new B();

		System.out.println(b1.y);
		b1.getY();
		System.out.println("----------------");
		System.out.println(b1.x);
		b1.getX();


		
	}
}