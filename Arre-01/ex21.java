/*
Array Case 21: Move Last Digit to First (Each Element)
 
WAP to shift last digit to first from each elements
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{312,523,4675,7325,46,7236,828,53,564,437}
*/

public class ex21{

	public static int getLastDigit(int num){
		int last=num%10;
		return last;

	}

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

	

	public static int getDigit(int num){
		int cnt=getCount(num);
		int last=getLastDigit(num);
		int multiPlxer=multiPlxer(cnt);

		int newnum=multiPlxer*last;

		int n=num/10;

		int result=newnum+n;
		return result;




	}

	public static void printDigit(int arr[]){
		System.out.print("Output: ");
		for(int i=0;i<arr.length;i++){
			System.out.print(" "+getDigit(arr[i]));
		}
	}





	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374};

			printDigit(arr);


	}
}