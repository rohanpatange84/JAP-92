/*
Array Case 6: Elements Greater than Average
 
Find the average of the array, and then display all elements that are greater than this average.
 
Example Input:
Array = [3, 7, 9, 2, 6]
 
Step 1: Average = (3+7+9+2+6)/5 = 27/5 = 5.4
Step 2: Elements greater than 5.4 â†’ 7, 9, 6
 
Expected Output:
Average = 5.4
Elements greater than average = 7 9 6
*/

public class ex6{

	public static double getAverage(int arr[]){
		double sum=0;
		for(int i=0;i<arr.length;i++){
			sum=sum+arr[i];
		}
		double average = sum/arr.length;
		return average;
		
	}

	public static void printGreater(int arr[],double average){
		System.out.print("Elements greater than average =");
		for(int i=0;i<arr.length;i++){
			if(average<=arr[i])
				System.out.print(" "+arr[i]);
		}

	}
	public static void main(String[] args) {
		int arr[]=new int[]{3,7,9,2,6};

		double average=getAverage(arr);
		System.out.println("Average = "+average);
		printGreater(arr,average);


	}
}