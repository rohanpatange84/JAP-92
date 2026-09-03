import java.util.Scanner;

public class Ex2{
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num;
		System.out.print("Enter num:");
		num=sc.nextInt();


		int arr[]=new int[]{11,22,33,44,55};

		int brr[]=new int[arr.length+1];


		for(int i=0;i<arr.length;i++){
			brr[i+1]=arr[i];
		}

		brr[0]=num;


		for(int j=0;j<brr.length;j++){
			System.out.println(brr[j]);
		}
		
	}
}