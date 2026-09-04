//Write a Java program to add two matrices.
import java.util.Scanner;
public class AddMatrix{
	

	public static void fillMatrix(int arr[][]){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print("Enter value: ");
				int val=sc.nextInt();
				arr[i][j]=val;
			}
		}
	}

	public static void printMatrix(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static void addMatrix(int arr[][],int brr[][],int crr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				crr[i][j]=arr[i][j]+brr[i][j];
			}

		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row;
		int col;

		System.out.print("Enter row:");
		row=sc.nextInt();
		System.out.print("Enter row:");
		col=sc.nextInt();

		int arr[][]=new int[row][col];
		int brr[][]=new int[row][col];
		int crr[][]=new int[row][col];


		System.out.println("Enter value for arr:");
		fillMatrix(arr);
		System.out.println("Enter value for brr:");
		fillMatrix(brr);
        System.out.println("Matrix arr");
		printMatrix(arr);
		System.out.println("Matrix brr");
		printMatrix(brr);
		System.out.println("Matrix crr");
		printMatrix(crr);

		addMatrix(arr,brr,crr);
		System.out.println("Matrix brr after adition");
		printMatrix(crr);






	}
}