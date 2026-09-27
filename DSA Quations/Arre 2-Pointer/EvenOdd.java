public class EvenOdd{


	public static int[] swapEvanOdd(int arr[]){

		int i=0;
		int j=arr.length-1;

		while(i<j){
			if(arr[i]%2==1 && arr[j]%2==0){
				swap(arr,i,j);
				i++;
				j--;
			}
			if(arr[i]%2==0){
				i++;
			}
			if(arr[j]%2==1){
				j--;
			}
		}
		return arr;
	}

	public static void printArr(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static int [] swap(int arr[],int i,int j){
		arr[i]=arr[i]+arr[j];
		arr[j]=arr[i]-arr[j];
		arr[i]=arr[i]-arr[j];

		return arr;
	}
	public static void main(String[] args) {
		

		int arr[]=new int[]{1,2,3,4,5,6,7,8};

		printArr(arr);

		swapEvanOdd(arr);

		printArr(arr);




	}
}