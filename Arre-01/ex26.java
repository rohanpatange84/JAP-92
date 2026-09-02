/*
Array Case 26: Replace Each Element with Highest Digit
 WAP to replace highest digit from each elements
 Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56}
output:{3, 5, 7, 7, 6, 7, 8, 5, 6, 7, 6}
*/

public class ex26{

	public static int getHigh(int num){
		int rem=0;

		while(num>0){
			if(rem<num%10){
				rem=num%10;
			}
			num=num/10;
		}

		return rem;
	}

	public static void replaceHiDigit(int arr[]){
		for(int i=0;i<arr.length;i++){
			arr[i]=getHigh(arr[i]);
		}
		System.out.print("Output :");
		for(int j=0;j<arr.length;j++){
			System.out.print(" "+arr[j]);
		}
	}

	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374,56};
		replaceHiDigit(arr);
		
	}
}