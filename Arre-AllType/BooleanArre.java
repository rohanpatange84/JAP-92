import java.util.Scanner;
public class BooleanArre{

	public static void fillArre(Boolean result[]){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<result.length;i++){

			System.out.println("Enter result 'pass-true' 'fail-false':");
			result[i]=sc.nextBoolean();

		}
	}	

	public static void printArre(Boolean result[]){
		for(Boolean res:result){
			System.out.print(res+" ");
		}
		System.out.println();
	}	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size;

		System.out.println("Enter size: ");
		size=sc.nextInt();


		Boolean result[]=new Boolean[size];

		System.out.println("----------before fill---------");
		printArre(result);

		fillArre(result);

		System.out.println("---------after fill---------");
		printArre(result);





	}
}