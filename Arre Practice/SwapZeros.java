public class SwapZeros{

	public static int [] swapArre(int arr[]){
		int i=0;
		int j=arr.length-1;

		while(i<j){
			if(arr[i]==1&&arr[j]==0){
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
				i++;
				j--;
			}

			if(arr[i]==1&&arr[j]==1){
				
				
				j--;
			}
		}
		return arr;

	}

	public static void printArre(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		int arr[]=new int[]{1,0,0,1,1,0,0,1,0,1};

		printArre(arr);
		swapArre(arr);
		printArre(arr);






	}
}