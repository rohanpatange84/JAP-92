/*
Array Case 19: Replace Each Element with First and Last Digit
 
WAP to replace each elements with their first and last element
 
Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374}
output:{13,25,64,37,64,27,28,35,65,34}
*/

public  class ex19{

	public static int  getFirstDigit(int num){
		int rem=0;
		while(num>0){
			rem=num%10;
			num=num/10;
		}

		return rem;

	}


	public static int getLastDigit(int num){
		int last=num%10;
		return last;

	}

	public static void getDigit(int arr[]){
		System.out.print("Output :");
		for(int i=0;i<arr.length;i++){
			int first=getFirstDigit(arr[i]);
			int last=getLastDigit(arr[i]);
			int newnum=first*10+last;
			System.out.print(" "+newnum);
		}
	}


	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374};

		getDigit(arr);


	}
}
