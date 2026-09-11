package p2;
import java.util.Scanner;
import p1.Person;
import p1.Staff;
import p1.Students;

public class App{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numOfStd;
		int numOfStf;
		System.out.println("Enter number of students: ");
		numOfStd=sc.nextInt();

		System.out.println("Enter number of staf: ");
		numOfStf=sc.nextInt();

		Students std[]=new Students[numOfStd];
		Staff stf[]=new Staff[numOfStf];


		System.out.println("--------For Student--------");
		for(int i=0;i<std.length;i++){
			sc.nextLine();
			System.out.println("Enter Student "+(i+1)+" :");
			String name=sc.nextLine();
			System.out.println("Enter address: ");
			String address=sc.nextLine();
			System.out.println("Enter program: ");
			String program=sc.nextLine();
			System.out.println("Enter year: ");
			int year=sc.nextInt();
			System.out.println("Enter fee: ");
			int fee=sc.nextInt();
			std[i]=new Students(name,address,program,year,fee);

		}

		System.out.println("--------For Staff--------");
		for(int i=0;i<stf.length;i++){
			sc.nextLine();
			System.out.println("Enter Staff "+(i+1)+" :");
			String name=sc.nextLine();
			System.out.println("Enter address: ");
			String address=sc.nextLine();
			System.out.println("Enter school: ");
			String school=sc.nextLine();
			System.out.println("Enter pay: ");
			int pay=sc.nextInt();
			
			stf[i]=new Staff(name,address,school,pay);

		}

		System.out.println("----All students----");
		for(int i=0;i<std.length;i++){
			std[i].studentsInfo();
			System.out.println();
		}
		System.out.println("----All Staff----");
		for(int i=0;i<stf.length;i++){
			stf[i].staffInfo();
			System.out.println();
		}



	}
}