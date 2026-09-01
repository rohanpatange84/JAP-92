/*
Array Case 25: Reverse Each Element
 WAP to reverse each element from array
 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
Output:{321,532,4576,7523,46,7632,882,53,546,473,65}
*/

public class ex25{

	public static int reverseNum(int num){
		int reverse=0;

		while(num>0){
			reverse=reverse*10+num%10;
			num=num/10;

		}
		return reverse;
	}

	public static void reverseElement(int arr[]){
		for(int i=0;i<arr.length;i++){
			arr[i]=reverseNum(arr[i]);
		}


		for(int j=0;j<arr.length;j++){
			System.out.print(" "+arr[j]);
		}
	}

	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374,56};
		reverseElement(arr);
	}

}