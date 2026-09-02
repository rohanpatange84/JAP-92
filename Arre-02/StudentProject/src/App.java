import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Student s1[]=new Student[3];
		Scanner sc = new Scanner(System.in);


		for(int i=0;i<s1.length;i++){
			System.out.print("Enter name: ");
			String name=sc.nextLine();
			System.out.print("Enter Marks: ");
			int marks=sc.nextInt();
			sc.nextLine();
			s1[i]=new Student(name,marks);

		}


		


		for(int i=0;i<s1.length;i++){
			s1[i].getInfo();
		}


		
	}
}