import java.util.Scanner;
public class EqualMatrix{

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

	public static void checkEqual(int arr[][],int brr[][]){
		boolean res=true;
		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				if(arr[i][j]!=brr[i][j])
					res=false;
				break;


			}
		}
		if(res)
			System.out.println("Matrix are Equal");
		else
			System.out.println("Matrix are Not Equal");
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

		System.out.println("Fill Matrix arr");
		fillMatrix(arr);
		System.out.println("Fill Matrix brr");
		fillMatrix(brr);
		System.out.println("Matrix arr");
		printMatrix(arr);
		System.out.println("Matrix brr");
		printMatrix(brr);

		checkEqual(arr,brr);


		
	}
}