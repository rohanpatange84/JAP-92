/*
Array Case 23: Replace Each Element with Sum of Digits
 
WAP to replace each elements with their sum of digit
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output: {6, 10, 22, 17, 10, 18, 18, 8, 15, 14, 11}
*/

public class ex23{

	public static int sumOfDigit(int num){
		int temp=num;
		int sum=0;
		while(temp>0){
			sum=sum+temp%10;
			temp=temp/10;
		}
		return sum;
	}


	public static void printDigit(int arr[]){
		System.out.print("Sum of digit of arr element :");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+sumOfDigit(arr[i]));
		}
	}
	public static void main(String args[]){
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374,56};

		printDigit(arr);
	}
}