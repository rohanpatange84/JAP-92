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
			rem=num%10;
			
			if(rem<num%10)
				rem=num%10;
			num=num/10;
		}

		return rem;
	}

	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374,56};
		System.out.print(getHigh(9587));
	}
}