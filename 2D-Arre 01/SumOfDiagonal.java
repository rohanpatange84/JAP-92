import java.util.Scanner;
public class SumOfDiagonal{
	public static void fillMatrix(int matrix[][]){
		Scanner sc = new Scanner(System.in);
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print("Enter valur:");
				matrix[i][j]=sc.nextInt();
			}
		}
	}
	

	public static int sumOfMajorDia(int matrix[][]){
		int sum=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(i==j)
					sum=sum+matrix[i][j];

			}
		}
		return sum;
	}

	public static int sumOfMinorDia(int matrix[][]){

		int sum=0;
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				if(i+j==matrix.length-1)
					sum=sum+matrix[i][j];

			}
		}
		return sum;
	}

	public static void printMatrix(int matrix[][]){
		for(int i=0;i<matrix.length;i++){
			for(int j=0;j<matrix[i].length;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int row;
		int col;

		System.out.print("Enter row:");
		row=sc.nextInt();
		System.out.print("Enter col:");
		col=sc.nextInt();

		int matrix[][]=new int[row][col];

		fillMatrix(matrix);
		printMatrix(matrix);

		int sumOfMajorDia=sumOfMajorDia(matrix);

		int sumoOfMinorDia=sumOfMinorDia(matrix);

		System.out.println("Sum of major diagonal is:"+sumOfMajorDia);

				System.out.println("Sum of minor diagonal is:"+sumoOfMinorDia);




	}
}