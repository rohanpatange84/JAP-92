public class Ex1{
	public static void main(String[] args) {
		int arr[][]=new int[][]{{10,20,30,40,50},{11,22,33,44,55}};

		// int brr[]=new int []{2,4,6,8,10,12,14,16,18,20};

		// for(int n:brr){
		// 	System.out.println(n);
		// }


		for(int i=0;i<arr.length;i++){
			for(int j=0;j<arr[i].length;j++){
				System.out.println(arr[i][j]);
			}
		}
		System.out.println("-----------------");

		for(int ele[]:arr){
			for(int num:ele){
				System.out.print(num+" ");
			}
			System.out.println();
		}


		
	}
}