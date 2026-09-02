import java.util.Scanner;
public class App{
	public static void main(String[] args) {
		Student s1[]=new Student[2];
		Scanner sc = new Scanner(System.in);

		for(int i=0;i<s1.length;i++){
			System.out.print("Enter Name: ");
			String name=sc.nextLine();
			sc.nextLine();
			s1[i]=new Student(name);
			
			for(int j=0;j<5;j++){
				System.out.print("Enter Mark: ");
				int mark=sc.nextInt();
				int index=j;
				s1[i].setMark(index,mark);
			}
		}

		for(int i=0;i<5;i++){
			System.out.println(s1[0].marks[i]);
		}





		


		


	}
}