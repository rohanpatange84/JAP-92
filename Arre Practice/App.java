public class App{

		public static void reverseArre(int arr[]){
			int i=0;
			int j=arr.length-1;

			while(j>i){
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
				i++;
				j--;
			}
		}

		public static void printArr(int arr[]){
			for(int num:arr){
				System.out.print(num+" ");
			}
			System.out.println();
		}

	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,40,50};

		printArr(arr);

		reverseArre(arr);

		printArr(arr);


	}
}