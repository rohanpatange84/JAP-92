public class Arrey{

	public static int[] bubbleShort(int arr[]){
		int n= arr.length;

		for(int i=0;i<n-1;i++){
			for(int j=0;j<n-i-1;j++){
				if(arr[j]>arr[j+1]){
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
		}
		return arr;
	}

	public static void printArr(int arr[]){

		for(int num:arr){
			System.out.print(num+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		

		int arr[]=new int[]{5,4,3,-65,0,2,1,0,-1};

		bubbleShort(arr);

		printArr(arr);
	}
}