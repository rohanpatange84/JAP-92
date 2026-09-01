/*
Array Case 12: Shift Last to First (Without Third Variable)
 
Write a program to move the last element of the array to the first position (shift right by one) without using a third variable.
 
Example Input:
Array = [10, 20, 30, 40, 50]
 
Expected Output:
Before Shift: [10, 20, 30, 40, 50]
After Shift:  [50, 10, 20, 30, 40]
*/

public class ex12{

	public static void reverseArr(int arr[]){

		int i=0;
		int j=arr.length-1;
		while(i<j){
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];

			i++;
			j--;
		}

		System.out.print("Reverse arr :");
		for(int k=0;k<arr.length;k++){
			System.out.print(" "+arr[k]);
		}
		System.out.println();
		shiftElement(arr);


	}

	public static void shiftElement(int arr[]){

		int i=1;
		int j=arr.length-1;
		while (i<j){
			arr[i]=arr[i]+arr[j];
			arr[j]=arr[i]-arr[j];
			arr[i]=arr[i]-arr[j];

			i++;
			j--;

		}
		System.out.print("Shifted arr :");
		for(int k=0;k<arr.length;k++){
			System.out.print(" "+arr[k]);
	}
}


	public static void main(String[] args){
		
		int arr[]=new int[]{10,20,30,40,50};
		reverseArr(arr);
	}
}