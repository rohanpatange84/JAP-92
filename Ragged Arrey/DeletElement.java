//Write a Java program to delete an element from an array at a specified position.


public class DeletElement{

	public static void deletElement(int arr[],int brr[],int position){
		for(int i=0;i<brr.length;i++){
			if(i<position-1)
			brr[i]=arr[i];
			else
				brr[i]=arr[i+1];
		}
	}
	public static void printArre(int arr[]){
		for(int val:arr){
			System.out.print(val+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,40,50};

		int brr[]=new int[arr.length-1];

		int position=4;

		printArre(arr);

		printArre(brr);

		deletElement(arr,brr,position);
		printArre(brr);


	}
}