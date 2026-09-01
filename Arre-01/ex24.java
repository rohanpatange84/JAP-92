/*
Array Case 24: Replace Each Element with Average of Digits
 WAP to replace each elements with their avg of digit
 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output: {2, 3, 5, 4, 5, 4, 6, 4, 5, 4, 5}
*/

public  class ex24{

	public static int getAverage(int num){
		int sum=0;
		int cnt=0;
		while(num>0){
			sum=sum+num%10;
			num=num/10;
			cnt++;
		}

		int average=sum/cnt;
		return average;


	}

	public static void printDigit(int arr[]){

		for(int j=0;j<arr.length;j++){
			arr[j]=getAverage(arr[j]);
		}

		System.out.print("Average : ");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+(arr[i]));
		}

		

		
		
	}

	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374,56};

		printDigit(arr);


	}
}