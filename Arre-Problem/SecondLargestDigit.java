public class SecondLargestDigit{

	public static int secondLarge(int arr[]){
		int large=0;
		for (int i=0;i<arr.length;i++) {
			if(large<arr[i])
				large=arr[i];
		}

		int sec=0;
		for (int i=0;i<arr.length;i++) {
			if(arr[i]==large){
				continue;
			}
			if(arr[i]>sec){
				sec=arr[i];
			}
		}
		return sec;

	}
	public static void main(String[] args) {
		int arr[]= new int[]{11,99,323,44,100};

		System.out.println(secondLarge(arr));

		


	}
}