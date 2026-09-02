/*
Array Case 30: Find Adjacent Values
 
Write a program to find the absolute difference between each element of the array and its next adjacent element.
Store and display all these differences in a new array.
 
Example Input:
Array = [15, 23, 18, 26, 72, 36, 49, 38, 60, 17, 22, 46]
 
Expected Output:
Differences = [8, 5, 8, 46, 36, 13, 11, 22, 43, 5, 24]
*/

public class ex30{
	public static void main(String[] args) {
		int arr[]=new int[]{15, 23, 18, 26, 72, 36, 49, 38, 60, 17, 22, 46};

		for(int i=0;i<arr.length;i++){
			int diff=arr[i]-arr[i+1];
			System.out.println(diff);
			arr[i]=diff;
		}

		for(int j=0;j<arr.length;j++){
			System.out.print(" "+arr[j]);
		}
	}
}