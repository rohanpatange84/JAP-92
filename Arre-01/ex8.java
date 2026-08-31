/*
Array Case 8: Shift Last Element to First
WAP to shift last element to first from array.
 Example Input:
input: {10,20,30,40,50}
Output:{50,10,20,30,40}
*/
public class ex8{
	public static void main(String[] args) {
		int arr[]=new int[]{10,20,30,40,50};
		int lastdigit=arr[arr.length-1];

		for(int i=0;i<arr.length-1;i++){
			arr[i+1]=arr[0];

		}
		arr[0]=lastdigit;

		for(int i=1;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}