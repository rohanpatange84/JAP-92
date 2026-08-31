/*
Array Case 2: Sum of Array Elements
Find the sum of all elements in an array.
Example Input:
Array = [5, 8, 12, 6]
Expected Output:
Sum = 31
*/

public class ex2{

	public static int  findSum(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];

		}
		return sum;
	}

	public static void main(String[] args) {
		int arr[]=new int[]{5,8,12,6};

		int sum=findSum(arr);
		System.out.println("Sum: "+sum);


	}
	
}