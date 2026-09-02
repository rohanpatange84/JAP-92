/*
Array Case 11: Shift First to Last (Without Third Variable)
 
Write a program to move the first element of the array to the last position (shift left by one) without using a third variable.
 
Example Input:
Array = [1, 2, 3, 4, 5]
 
Expected Output:
Before Shift: [1, 2, 3, 4, 5]
After Shift:  [2, 3, 4, 5, 1]
*/

public class ex11{

	public static void shiftElement(int arr[]){
		for(int i=0;i<arr.length;i++){
			if (i==4) break;
			
			arr[i]=arr[i+1];
		}
	}
	public static void main(String[] args) {
		int arr[]=new int[]{1,2,3,4,5};

		shiftElement(arr);

		for(int i=0;i<arr.length;i++){
			System.out.print(" "+arr[i]);
		}

		
	}
}