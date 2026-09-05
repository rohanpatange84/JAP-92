import java.util.Scanner;
public class Ex1{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int row;
		System.out.println("Enter row:");
		row=sc.nextInt();

		int arr[][]=new int[row][];

		for(int i=0;i<arr.length;i++){
			System.out.println("Enter column:");
			int col=sc.nextInt();

			arr[i]=new int[col];
		}


		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}




	}
}