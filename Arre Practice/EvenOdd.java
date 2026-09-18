public class EvenOdd{

	public static int evenNum(int arr[]){
		int even=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
			even++;
		}
		return even;
	}

	public static int oddNum(int arr[]){
		int odd=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
			odd++;
		}
		return odd;
	}

	public static void fillEvenOdd(int arr[],int even[],int odd[]){
		int ev=0;
		int od=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even[ev]=arr[i];
				ev++;
			}else{
				odd[od]=arr[i];
				od++;
			}
		}
	}


	public static void printArr(int arr[]){
		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7,8,9};

		int even[]=new int[evenNum(arr)];
		int odd[]=new int[oddNum(arr)];

		printArr(even);
		printArr(odd);

		fillEvenOdd(arr,even,odd);

		printArr(even);
		printArr(odd);

	}
}