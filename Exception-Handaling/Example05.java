import java.util.Scanner;
public class Example05{

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int x,y;
		System.out.println("Enter x::");
		x=sc.nextInt();
		System.out.println("Enter y::");
		y=sc.nextInt();

		int num=x/y;

		int arr[]={11,22,33,44,55};

		try{

			System.out.println(arr[num]);
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("---> "+e);
		}catch(NullPointerException e){
			System.out.println("---> "+e);
		}

		System.out.println("Prgram end ::");




	}
}