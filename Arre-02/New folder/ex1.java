import java.util.Scanner;
public class ex1{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num;

		System.out.print("Enter num:");
		num=sc.nextInt();


		int arr[]=new int[]{10,20,30,40,50};

		int brr[]=new int[arr.length+1];

		for(int i=0;i<arr.length;i++){
			brr[i]=arr[i];
		}

		brr[arr.length]=num;


		for(int j=0;j<brr.length;j++){
			System.out.println(brr[j]);
		}
		
	}
}