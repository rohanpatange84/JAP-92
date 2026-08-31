/*
Array Case 7: Shift First Element to Last
 
WAP to shift first element to last from array
 
Example Input:
input: {10,20,30,40,50}
output:{20,30,40,50,10}

*/

public class ex7{
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,40,50,124,45,854};
		int firstdigit=arr[0];
		
		for(int i=0;i<arr.length-1;i++){
			arr[i]=arr[i+1];
		}
		
		arr[arr.length-1]=firstdigit;
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]+" ");
		}
	}
}