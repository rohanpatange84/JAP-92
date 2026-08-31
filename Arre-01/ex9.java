/*
Array Case 9: Swap First and Last Element
Write a program to swap the first element and the last element of an array.
 Example Input:
Array = [10, 20, 30, 40, 50]
Expected Output:
Before Swap: [10, 20, 30, 40, 50]
After Swap:  [50, 20, 30, 40, 10]

*/

public class ex9{
	public static void main(String[] args) {
		int arr[]={10,20,30,40,50};

		int firstnum=arr[0];
		int lastnum=arr[arr.length-1];

		arr[0]=lastnum;
		arr[arr.length-1]=firstnum;

		System.out.print("Swap first and last number = ");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}
	}
}