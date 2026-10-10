import java.util.Scanner;

public class Example02{
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		int age;
		System.out.println("Enter age:");
		age=sc.nextInt();

		if(age>=18){
			System.out.println("Can wote");
		}else{
			throw new ArithmeticException();
		}
	}
}