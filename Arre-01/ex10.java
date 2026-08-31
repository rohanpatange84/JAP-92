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
	public static void main(String[] args) {
		int arr[]=new int[]{7,14,21,28,35};

		for(int i=0;i<arr.length;i++){
			if(i==0){
				arr[i]=arr[arr.length-1];
			
			}

		}





	}
}