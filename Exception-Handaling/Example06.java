import java.util.Scanner;
public class Example06{

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		int x,y;
		System.out.println("Enter x::");
		x=sc.nextInt();
		System.out.println("Enter y::");
		y=sc.nextInt();

		

		int arr[]={11,22,33,44,55};

		String str=null;
		String str1="Kareena";

		try{
			System.out.println("in the try ::");

			int num=x/y;

			System.out.println(arr[num]);


			System.out.println(str1.charAt(10));

			System.out.println(str.length());


		}catch(ArithmeticException | ArrayIndexOutOfBoundsException | NullPointerException| StringIndexOutOfBoundsException e){
			System.out.println("---> "+e);

		}

		System.out.println("Prgram end ::");




	}
}