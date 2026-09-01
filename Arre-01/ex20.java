/*
Array Case 20: Move First Digit to Last
 
WAP to replace first digit at last of element.
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{231,352,7546,2573,46,3672,882,53,456,743}
*/

public class ex20{

	public static int getCount(int num){
		int temp=num;
		int cnt=0;
		while(temp>0){
			cnt++;
			temp=temp/10;
		}
		return cnt;

	}

	public static int multiPlxer(int cnt){
		int multiPlxer=1;
		while(cnt>1){
			cnt--;
			multiPlxer=multiPlxer*10;
		}

		return multiPlxer;
	}


	public static int  getFirstDigit(int num){
		int temp=num;
		int rem=0;
		while(temp>0){
			rem=temp%10;
			temp=temp/10;
		}

		return rem;

	}

	public static int getDigit(int num){
		int cnt=getCount(num);
		int first=getFirstDigit(num);

		int multiPlxer=multiPlxer(cnt);

		int newnum=num%(multiPlxer*first);
		int result=newnum*10+first;

		return result;

		

	}

	public static void moveFirstDigitToLast(int arr[]){
		System.out.print("Output :");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+getDigit(arr[i]));
		}
	}

	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374};

		moveFirstDigitToLast(arr);

	}
}