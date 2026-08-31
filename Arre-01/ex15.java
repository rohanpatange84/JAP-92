public class ex15{

	public static int getMax(int arr[]){
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(max<arr[i])
				max=arr[i];
			else
				max=max;
		}
		return max;
	}

	public static int getSecondMax(int arr[],int maxx){
		
		int max=0;
		for(int i=0;i<arr.length;i++){
			if(maxx==arr[i]) break;
			if(max<arr[i])
				max=arr[i];
			else
				max=max;
		}
		return max;

	}

	public static void main(String[] args) {
		int arr[]=new int[]{12,545,67,2345,89,34};

		int max=getMax(arr);
		System.out.println("Maxnum = "+max);

		int secondmax =getSecondMax(arr,max);
		System.out.println("SecondmaxNum = "+secondmax);

		
	}
}