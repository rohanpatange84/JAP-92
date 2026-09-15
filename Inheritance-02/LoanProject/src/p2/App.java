package p2;
import java.util.Scanner;
import java.util.Date;
import p1.Loan;
public class App{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Anual intrest: ");
		double intrest=sc.nextDouble();
		System.out.println("Enter years: ");
		int years=sc.nextInt();
		System.out.println("Enter Loan amout: ");
		double amount=sc.nextDouble();

		Loan l1 = new Loan(intrest,years,amount);

		Date date=l1.getLoanDate();
		System.out.println(date);

		System.out.println("Total Payment:"+l1.getTotalPayment());
		System.out.println("Monthly Payment:"+l1.getMonthlyPayment());


	}
}