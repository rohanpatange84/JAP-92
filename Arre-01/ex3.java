/*
Array Case 3: Average of Array Elements
Find the average value of all elements in an array.
Example Input:
 Array = [2, 4, 6, 8, 10]

Expected Output:
Average = 6.0
*/

public class ex3{

	public static double grtAverage(int arr[]){
		int sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}

		int average = sum/(arr.length);
		return average;
	}
	public static void main(String[] args) {
		int arr[]=new int[]{2,4,6,8,10};

		double average = grtAverage(arr);
		System.out.println("Average = "+average);


	}
}