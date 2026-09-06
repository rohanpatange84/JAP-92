//Write a Java program to insert an element into an array at a specified position.
public class InsertElement{

	public static void insertValue(int arr[],int brr[],int position,int value){
		brr[position-1]=22;
		for(int i=0;i<arr.length;i++){
			if(i<position-1)
			brr[i]=arr[i];
			else
			brr[i+1]=arr[i];
		}
	}
	public static void printArre(int arr[]){
		for(int val:arr){
			System.out.print(val+" ");
		}
	}
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,40,50};

		int brr[]=new int[arr.length+1];

		int position=3;
		int value=95;

		
		
		printArre(arr);
		insertValue(arr,brr,position,value);
		System.out.println();
		printArre(brr);



	}
}