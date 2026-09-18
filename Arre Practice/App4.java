public class App4{

	public static void deletAt(int arr[],int brr[],int position){
		for(int i=0;i<brr.length;i++){
			if(i<position-1)
				brr[i]=arr[i];
			else
				brr[i]=arr[i+1];
		}
	}

	public static void printArr(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,4,5};

		int brr[]=new int[arr.length-1];

		int position=4;

		printArr(brr);

		deletAt(arr,brr,position);

		printArr(brr);


		
	}
}