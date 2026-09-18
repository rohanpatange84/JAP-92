public class App3{

	public static void inseartAt(int arr[],int brr[],int num,int position){
		brr[position-1]=num;
		for(int i=0;i<arr.length;i++){
			if(i<position-1)
				brr[i]=arr[i];
			
			else
				brr[i+1]=arr[i];
		}

	}

	public static void printArr(int arr[]){
		for( int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,5,6};

		int brr[]= new int[arr.length+1];

		int num=4;
		int position=4;

		printArr(brr);

		inseartAt(arr,brr,num,position);
			printArr(brr);


	}
}