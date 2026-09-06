//Write a Java program to put even and odd elements of an array into two separate arrays.

public class EvenOdd{

	public static int  cntEven(int arr[]){
		int even=0;
		for (int i=0;i<arr.length;i++){
			if(arr[i]%2==0)
				even++;
		}
		return even;
	}

	public static int  cntOdd(int arr[]){
		int odd=0;
		for (int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				odd++;
		}

		return odd;
	}

	public static void fillArre(int arr[],int even[],int odd[]){
		int e=0;
		int o=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even[e]=arr[i];
				e++;
			}if(arr[i]%2!=0){
				odd[o]=arr[i];
				o++;
			}
		}
	}

	public static void printArre(int arr[]){
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5,6,7};

		int even[]=new int[cntEven(arr)];
		int odd[]=new int[cntOdd(arr)];


		printArre(even);
		printArre(odd);
		fillArre(arr,even,odd);
		System.out.println("---------------");
		printArre(even);
		printArre(odd);




	
	}
}