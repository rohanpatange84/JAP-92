import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Scanner sc =  new Scanner(System.in);
		int n;
		int value;
		System.out.print("Enter Number : ");
		n=sc.nextInt();


		NumberOpe n1=new NumberOpe();

		n1.num=n;
		n1.status=true;
		
		do{
			System.out.println("-------------------------------------------");
			System.out.println("Enter 1-------Count Digit");
			System.out.println("Enter 2-------Last Digit");
			System.out.println("Enter 3-------First Digit");
			System.out.println("Enter 4-------Sum of first and last Digit");
			System.out.println("Enter 5-------Sum Of Digits");
			System.out.println("Enter 6-------Product of Digits");
			System.out.println("Enter 7-------Reverse number");
			System.out.println("Enter 8-------Check palindrome");
			System.out.println("Enter 9-------Print factors");
			System.out.println("Enter 10-------Calculate factorial");
			System.out.println("Enter 11-------shout down");

			System.out.println("-------------------------------------------");
			System.out.println("Enter value");
			value=sc.nextInt();

			switch(value){
					case 1:
						System.out.println("The count of number is : "+n1.countDigit());
						break;
					case 2:
						System.out.println("The last digit of number is : "+n1.lastDigit());
						break;
					case 3:
						System.out.println("The first digit of number is : "+n1.firstDigit());
						break;

					case 4:
						System.out.println("The sum of first and last digit of number is : "+n1.sumOfFirstAndLastDigit());
						break;

					case 5:
						System.out.println("The sum of digit  : "+n1.sumOfDigit());
						break;

					case 6:
						System.out.println("The product of digit  : "+n1.productOfDigit());
						break;

					case 7:
						System.out.println("Reverse number is  : "+n1.reverseNum());
						break;

					case 8:
						boolean res = n1.isPelindrome();
						if(res)
						System.out.println("Number is Palindrome");
						else 
						System.out.println("number is not palindrome");
						break;

					case 9:
						n1.printFactors();
						break;

					case 10:
						System.out.println("Factorial of number is  : "+n1.findFactorial());
						break;

					case 11:
						n1.status=false;
						break;


					default:
						System.out.println("invalid input");

			}



		}while(n1.status);
	}
}