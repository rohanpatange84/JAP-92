public class RightShift{
	//reverse arr
	public static void rightShift(int arr[]){
		int i=0;
		int j=arr.length-1;

		while(i<j){
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;
			j--;
		}
		skipFirst(arr);
	}

	//skip 1 element and reverse
    public static void skipFirst(int arr[]){
		int i=1;
		int j=arr.length-1;

		while(i<j){
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];
			i++;
			j--;
		}
	}


	//print arr
	public static void printArre(int arr[]){
		for(int val:arr){
			System.out.print(val+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]=new int[]{11,22,33,44,55};

		printArre(arr);
		rightShift(arr);

		System.out.println("----------after right shift----------");
		printArre(arr);

	}
}