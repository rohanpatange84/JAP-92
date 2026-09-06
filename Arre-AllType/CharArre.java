
import java.util.Scanner;

public class CharArre{

	public static void firllArre(char alphabet[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<alphabet.length;i++){
			System.out.println("Enter character:");
			alphabet[i]=sc.next().charAt(0);
		}
	}

	public static void printArre(char alphabet[]){
		for(int i=0;i<alphabet.length;i++){
			System.out.print(alphabet[i]+" ");

		}
		System.out.println();
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;

		System.out.println("Enter size:");
		size=sc.nextInt();

		char alphabet[]=new char[size];

		System.out.println("-------befor fill--------");
		printArre(alphabet);

		firllArre(alphabet);

		System.out.println("-------after fill--------");
		printArre(alphabet);






	}
}