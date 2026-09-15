package p2;

import java.util.Scanner;
import p1.BMI;

public class App{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter age: ");
		int age= sc.nextInt();
		System.out.println("Enter weight (pound):");
		double weight=sc.nextDouble();
		System.out.println("Enter height (inch):");
		double height=sc.nextDouble();
		BMI b1 = new BMI(name,age,weight,height);

		
		String status=b1.getStatus();

		System.out.println(status);
	}
}