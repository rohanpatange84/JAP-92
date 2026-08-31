public class ex4{

	public static void printOddElement(int arr[]){
		System.out.print("Odd element:");
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				System.out.print(" "+arr[i]);

		}
			System.out.println();
	}

	public static  int getSumOfOld(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0)
				sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int arr[]=new int[]{11,22,33,44,55};

		int sum= getSumOfOld(arr);
		printOddElement(arr);
	
		System.out.println("Sum : "+sum);


	}
}