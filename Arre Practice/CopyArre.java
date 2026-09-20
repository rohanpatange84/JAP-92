public class CopyArre{

	public static void copyArres(int arr[],int brr[]){

		for(int i=0;i<arr.length;i++){
			brr[i]=anrr[i];
		}
	}

	public static void printArr(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}

		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]=new int[]{11,22,33,44,55};

		int brr[]=new int[arr.length];


		printArr(brr);

		copyArres(arr,brr);
		printArr(brr);



	}
}