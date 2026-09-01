/*
Array Case 10: Swap First and Last Element (Without Third Variable)
 Write a program to swap the first element and the last element of an array without using a third (temporary) variable.
 Example Input:
Array = [7, 14, 21, 28, 35]
 Expected Output:
Before Swap: [7, 14, 21, 28, 35]
After Swap:  [35, 14, 21, 28, 7]

*/

public class ex10{

	public static void swapFirstAndLast(int arr[]){
		int i=0;
		int j=arr.length-1;

		while(i<j){
			if(i==0){
				arr[i]=arr[i]+arr[j];
				arr[j]=arr[i]-arr[j];
				arr[i]=arr[i]-arr[j];
			}
			i++;
			j--;

		}


		for(int k=0;k<arr.length;k++){
			System.out.print(" "+arr[k]);
		}

	}
	public static void main(String[] args) {
		int arr[]=new int[]{7,14,21,28,35};

		swapFirstAndLast(arr);

		




	}
}