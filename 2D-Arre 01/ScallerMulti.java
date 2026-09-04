
import java.util.Scanner;
public class ScallerMulti{


	public static void fillMatrix(int matrix[][]){
		Scanner sc =new Scanner(System.in);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print("Enter value:");
				matrix[i][j]=sc.nextInt();

			}
		}
	}


	public static void scallerMul(int matrix[][],int k){
		for(int i=0;i<matrix.length;i++){
			for (int j=0;j<matrix[i].length;j++) {
				matrix[i][j]=matrix[i][j]*k;
			}
		}
	}




	public static void printArr(int arr[][]){
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k;
		int row;
		int col;

		System.out.print("Enter Scaller Number:");
		k=sc.nextInt();
		System.out.print("Enter rows:");
		row=sc.nextInt();
		System.out.print("Enter column:");
		col=sc.nextInt();


		int matrix[][]=new int[row][col];

		


		fillMatrix(matrix);
		printArr(matrix);
		scallerMul(matrix,k);

		System.out.println("After scaller multiplication");
		printArr(matrix);

	}
}