public class RotateArre{

	public static int[] reverseArre(int arr[],int n){

		for(int k=1;k<=n;k++){
		int i=0;
		int j=arr.length-1;

		while(i<j){
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];

			i++;
			j--;
		}

		i=1;
		j=arr.length-1;

		while(i<j){
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];

			i++;
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
		int arr[]=new int[]{10,20,30,40,50,60};
		printArre(arr);

		reverseArre(arr,7);
		printArre(arr);



	}
}