import java.util.Scanner;
public class StringArre{


	public static void	firllArre(String name[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<name.length;i++){
			System.out.println("Ener name:");
			name[i]=sc.nextLine();
		}
	}

	public static void printArre(String name[]){
		for(int i=0;i<name.length;i++){
			System.out.print(name[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;

		System.out.println("Enter size");
		size=sc.nextInt();

		String name[]=new String[size];

		printArre(name);

		firllArre(name);
		System.out.println("---------Ater fill--------");

		printArre(name);


	}
}