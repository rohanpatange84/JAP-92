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
	public int sumOfFirstAndLastDigit(){
	    return lastDigit()+firstDigit();
	}

	//Calculate the sum of digits of any number
	public int sumOfDigit(){
		int temp=num;
		int sum=0;
		while(temp>0){
			sum=sum+temp%10;
			temp=temp/10;
		}
		return sum;
	}

	//Calculate the product of digits of any number
	public int productOfDigit(){
		int temp=num;
		int mul=1;
		while(temp>0){
			mul=mul*(temp%10);
			temp=temp/10;

		}
		return mul; 
	}

	//Reverse a given number
	public int reverseNum(){
		int temp=num;
		int newnum=0;
		while(temp>0){
			newnum=newnum*10+temp%10;
			temp=temp/10;
		}
		return newnum;
	}

	//Check whether a number is palindrome or not
	public boolean isPelindrome(){
		int rev=reverseNum();
		if (rev==num) 
			return true;
		else 
			return false;
	}

	//Print all factors of a given number
	public void printFactors(){
		System.out.println("The factors of number is:");
		System.out.println("______________________");
		for(int i=1;i<=num/2;i++){
			if(num%i==0)
				System.out.print(i+",");
		}
		System.out.println();
		System.out.println("______________________");
		
	}

	//Calculate the factorial of a number
	public int findFactorial(){
		int mul=1;
		for(int i=1;i<=num;i++){
			mul=mul*i;
		}
		return mul;
	}

}