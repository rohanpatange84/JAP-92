/*
Array Case 14: Maximum Element
 
Write a program to find the maximum element in an array.
 
Example Input:
Array = [12, 45, 67, 23, 89, 34]
 
Expected Output:
Maximum Element = 89
*/

public class ex14{

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

	public static void main(String[] args) {
		int arr[]=new int[]{12,545,67,2345,89,34};
		int max=getMax(arr);
		System.out.println(max);
		
	}
}