// 49. Find a Pair with a given Difference in a sorted array. 

public class Example49{


	public static void pairOfDiff(int arr[],int difference){

		for(int i=0;i<arr.length;i++){
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]-arr[i]==difference){
				System.out.print("("+arr[i]+","+arr[j]+") ");
			}
			}
		}
	}

	public static void main(String[] args) {
	int	arr[] = {1, 3, 5, 8, 10};
	int difference = 2;

	pairOfDiff(arr,difference);
	}
}