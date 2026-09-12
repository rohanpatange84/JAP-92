public class Demo{

	public static void getLastDigit(String args[]){
		int num=Integer.parseInt(args[1]);
		System.out.println("Last digit is: "+num%10);
	}

	public static void getFirstDigit(String args[]){
		int num=Integer.parseInt(args[1]);
			int rem=0;
			while(num>0){
				rem=num%10;
				num=num/10;
			}
			System.out.println("First digit is:"+rem);
	}

	public static void getSecondLastDigit(String  args[]){
		int num=Integer.parseInt(args[1]);
			int rem=0;
			int cnt=2;
			while(num>0&&cnt>0){
				rem=num%10;
				num=num/10;
				cnt--;
			}
			System.out.println("Second last digit is:"+rem);
	}

	public static void getSecondDigit(String args[]){
		int num=Integer.parseInt(args[1]);
			int rem=0;
			while(num>10){
				rem=num%10;
				num=num/10;
			}
			System.out.println("Second digit is:"+rem);
	}

	public static void getSumOfDigit(String args[]){
		int num=Integer.parseInt(args[1]);
		int sum=0;
			while(num>0){
				sum=sum+num%10;
				num=num/10;
			}
			System.out.println("Sum of Digit is :"+sum);
	}

	public static  void checkPalindrome(String args[]){
		String str=args[1];
			int start=0;
			int end=str.length()-1;
			while(start<end){
				if(str.charAt(start)!=str.charAt(end)){
					System.out.println("Not Palindrome");
					return;
				}
				start++;
				end--;
			}
			System.out.println("Palindrome");
	}

	public static void getAverage(String args[]){
		int num=Integer.parseInt(args[1]);
		int sum=0;
			while(num>0){
				sum=sum+num%10;
				num=num/10;
			}
		double average=sum/args[1].length();

		System.out.println("Average is: "+average);
	}


	public static void main(String[] args) {

		if(args[0].equals("-ld")){
			getLastDigit(args);	
		}

		if(args[0].equals("-fd")){
			getFirstDigit(args);
		}

		if(args[0].equals("-sld")){
			getSecondLastDigit(args);
		}

		if(args[0].equals("-sd")){
			getSecondDigit(args);
		}

		if(args[0].equals("-sum")){
			getSumOfDigit(args);	
		}

		if(args[0].equals("-pal")){
			checkPalindrome(args);
		}

		if(args[0].equals("-av")){
			getAverage(args);
		}


	}
}

