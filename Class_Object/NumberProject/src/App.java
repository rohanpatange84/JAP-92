import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n;
		System.out.print("Enter Number : ");
		n=sc.nextInt();


		NumberOpe n1=new NumberOpe();

		n1.num=n; 

		System.out.println("The count of number is : "+n1.countDigit());
		System.out.println("The last digit of number is : "+n1.lastDigit());
		System.out.println("The first digit of number is : "+n1.firstDigit());
		System.out.println("The sum of first and last digit of number is : "+n1.sumOfFirstAndLastDigit(n1.firstDigit(),n1.lastDigit()));

	}
}