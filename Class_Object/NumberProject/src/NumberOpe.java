public class NumberOpe{
	int num;


	// Count the number of digits in any number
	public int countDigit(){
		int temp=num;
		int cnt=0;
		while(temp>0){
			cnt++;
			temp=temp/10;
		}
		return cnt;
	}

	// Find last digit of any number
	public int lastDigit(){
		int temp=num;
		return temp%10;
	}
	// Find the first digit of any number
	public int firstDigit(){
		int temp=num;
		int rem=0;
		while(temp>0){
			rem=temp%10;
			temp=temp/10;
		}
		return rem;
	}

	//Find the sum of the first and last digit of any number
	public int sumOfFirstAndLastDigit(int num1,int num2){
	    return num1+num2;
	}


}