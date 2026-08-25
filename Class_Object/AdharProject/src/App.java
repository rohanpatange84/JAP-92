import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		String newname;
		String newdop;

		Aadhar a1=new Aadhar();

		a1.name="Rohan Patange";
		a1.dop="14/03/2003";
		a1.adharnum=2459;
		a1.addres="At. Post. Kondhur Tq. Kalamnuri Dist. Hingoli";

		do{
		System.out.println("Enter 1-------Name");
		System.out.println("Enter 2-------DOP");
		System.out.println("Enter 3-------Adhar Number");
		System.out.println("Enter 4-------Addres");
		System.out.println("Enter 5-------Change Name");
		System.out.println("Enter 6-------Change DOP");



		System.out.print("Enter value : ");
		n=sc.nextInt();

		switch(n){

		case 1:
			a1.displayName();
			break;

		case 2:
			a1.displayDop();
			break;

		case 3:
			System.out.println("Adhar num : "+a1.displayAdharNum());
			break;

		case 4:
			a1.displayAddres();
			break;

		case 5:
			sc.nextLine();
			System.out.println("Enter a new name :");
			newname=sc.nextLine();
			a1.changeName(newname);
			
			break;


		case 6:
			sc.nextLine();
			System.out.println("Enter a new DOP :");
			newdop=sc.nextLine();
			a1.changeDop(newdop);
			break;



		default:
			System.out.println("Invalid Input");
			break;
		}

		



		}while(a1.status);
		
	}
}