public class ex5{

	public static void getAverage(int arr[]){
		int odd=0;
		int even=0;
		int limit=arr.length;
		int oddnum[]=new int[limit];
		int o=0;
		int evennum[]=new int[limit];
		int e=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				even=even+arr[i];
				e++;
				evennum[e-1]=arr[i];
			}
			else{
				odd=odd+arr[i];
				o++;
				oddnum[o-1]=arr[i];
			}
		}

		double averageodd=odd/e;
		double averageeven=even/e;
		System.out.print("Odd element:");
		for(int i=0;i<oddnum.length;i++){
			if(oddnum[i]!=0)
			System.out.print(" "+oddnum[i]);
		}
		System.out.println(" Average="+averageodd);
		System.out.println();

			System.out.print("Even element:");
		for(int i=0;i<evennum.length;i++){
			if(evennum[i]!=0)
			System.out.print(" "+evennum[i]);
		}
			System.out.println(" Average="+averageeven);



		// System.out.println(odd);
		// System.out.println(even);

		
	}

	// 	public static double getAverage(int arr[]){
	// 	int sum=0;
	// 	for(int i=0;i<arr.length;i++){
	// 		sum=sum+arr[i];
	// 	}

	// 	int average = sum/(arr.length);
	// 	return average;
	// }


	public static void main(String[] args) {
		int arr[]=new int []{5,10,15,20,25};

		getAverage(arr);

	}
}