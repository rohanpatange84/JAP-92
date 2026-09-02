/*
Array Case 27: Append Sum of Digits to Each Element 
WAP to add sum of digit of each elements at last of elements

Example Input:
input: {123,235,6754,3257,64,2367,288,35,645,374,56};
Output:{1236,23510,675422,325717,6410,236718,28818,358,64515,37411,5611};
*/

public class ex27{

	public static int sumOfDigit(int num){
		int sum=0;
		while(num>0){
			sum=sum+num%10;
			num=num/10;
		}
		return sum;
	}

	public static int getMultiplxer(int num){
		int multiplxer=1;
		while(num>0){
			multiplxer=multiplxer*10;
			num=num/10;
		}
		return multiplxer;
}

	public static int newNum(int num){
		int sum=sumOfDigit(num);
		int multiplxer=getMultiplxer(sum);

		int newnum=multiplxer*num+sum;

		return newnum;

	}

	public static void newArr(int arr[]){
		for(int i=0;i<arr.length;i++){
			arr[i]=newNum(arr[i]);
		}

		System.out.print("Output :");
		for(int j=0;j<arr.length;j++){
			System.out.print(" "+arr[j]);
		}
	}

	public static void main(String[] args) {
		int arr[]=new int[]{123,235,6754,3257,64,2367,288,35,645,374,56};

		newArr(arr);

		
	}
}
