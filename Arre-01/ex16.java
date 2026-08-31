/*
Array Case 16: Find Pair with Given Sum
 
Write a program to find all pairs of two elements in an array whose sum is equal to a given number.
 
Example Input:
Array = [4, 8, 12, 16]
Target Sum = 20
 
Expected Output:
Pairs with sum 20:
(4, 16)
(8, 12)
*/

public class ex16{
	public static void main(String[] args) {
		int arr[]=new int[]{4,8,12,16};
		int sum=20;
		System.out.println("Pairs with sum "+sum+":");
		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if (arr[i]+arr[j]==sum)
					System.out.println("("+arr[i] +","+arr[j]+")");
			}
		}
	}
}