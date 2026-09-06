//Write a Java program to copy all elements from one array to another array.
import java.util.Scanner;
public class CopyArre{


	public static void copyAre(int arr[][],int brr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				brr[i][j]=arr[i][j];
			}
		}
}

	public static void printArre(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}

	public static void initializeArre(int arr[][],int brr[][]){
		for(int i=0;i<arr.length;i++){
			
			int col= arr[i].length;
			brr[i]=new int[col];
		}
	}

	
	public static void main(String[] args) {
		int arr[][]=new int[][]{{10,20,30,40,50},{11,22,33,44,55}};

		int brr[][]=new int[arr.length][];

		initializeArre(arr,brr);

		printArre(brr);

		copyAre(arr,brr);
		System.out.println("After copy");
		printArre(brr);




	}
}