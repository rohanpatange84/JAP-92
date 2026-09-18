public class SwapLeft{

	public static void swapLeftArr(int arr[]){
		int num=arr[0];

		for(int i=0;i<arr.length;i++){
			if(i==arr.length-1)
				arr[i]=num;
			else
			arr[i]=arr[i+1];
		}
	}


	public static void swapRightArr(int arr[]){
		int num=arr[arr.length-1];

		for(int i=arr.length-1;i>=0;i--){
			if(i==0)
				arr[i]=num;
			else
				arr[i]=arr[i-1];

		}
	}


	public static void printArr(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]= new int[]{1,2,3,4,5};

		printArr(arr);

		// swapLeftArr(arr);
		swapRightArr(arr);

		printArr(arr);


	}
}