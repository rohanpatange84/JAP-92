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
		int arr[]=new int[]{5,10,15,20,25};


		for(int i=1;i<arr.length;i++){
			arr[i-1]=arr[arr.length-i];
		}

		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}