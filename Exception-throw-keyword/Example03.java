import java.util.Scanner;

class  IllegalAge extends RuntimeException{
	
	
	public IllegalAge(){}

	public IllegalAge(String s){
		super(s);
		

	}
}




public class Example03{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age;
		System.out.println("Enter age:");
		age=sc.nextInt();

		if(age>=18){
			System.out.println("Can wote");
		}else{
			throw new IllegalAge("----> illegal age");
		}
	}
}