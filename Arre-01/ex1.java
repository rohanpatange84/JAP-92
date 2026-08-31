/*Array Case 1: Forward and Backward Display
 Create an array of integers, store elements in it, and display the elements:
- In forward order (from first to last)
- In backward order (from last to first)
 Example Input:
Array = [10, 20, 30, 40, 50]
 Expected Output:
Forward: 10 20 30 40 50
Backward: 50 40 30 20 10
*/

public class ex1{

	public static void getForward(int arr[]){
		System.out.print("Forward:");
		for(int i=0;i<arr.length;i++){

			System.out.print(arr[i]+" ");
		}

	}

	public static void getBackword(int arr[]){
		System.out.print("Backword:");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");

	}
}
	public static void main(String[] args) {

		int arr[]=new int[]{10,20,30,40,50};
		getForward(arr);
		System.out.println();
		getBackword(arr);
		

		}


		
	}
