/*
Array Case 13: Reverse Array (Without Third Variable)
Write a program to reverse all elements of an array without using a third variable.
Example Input:
Array = [5, 10, 15, 20, 25]
 
Expected Output:
Before Reverse: [5, 10, 15, 20, 25]
After Reverse:  [25, 20, 15, 10, 5]
*/

public class ex13{
	public static void main(String[] args) {
		int arr[]=new int[]{5,10,15,20,25,30};

		int i=0;
		int j=arr.length-1;
		while(i<j){
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];

			i++;
			j--;
		}

		for(int k=0;k<arr.length;k++){
			System.out.print(" "+arr[k]);
		}
	}
}