import java.util.Scanner;
public class DoubleArre{

	public static void  fillArre(double marks[]){
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<marks.length;i++){
			System.out.println("Enter marks:");
			marks[i]=sc.nextDouble();
		}
	}

	public static void printArre(double marks[]){
		for(int i=0;i<marks.length;i++){
			System.out.print(marks[i] +" ");

		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size;
		System.out.println("Enter size");
		size=sc.nextInt();

		double marks[]=new double[size];

		System.out.println("--------befor fill----------");
		printArre(marks);

		fillArre(marks);

		System.out.println("--------after fill----------");
		printArre(marks);

	}
}