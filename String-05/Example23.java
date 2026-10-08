/*
✅ Q23. Sum All Digits in the String

Problem: Find the sum of digits in the string.

Input: welcome to 2024

Output: 8 (2 + 0 + 2 + 4)
*/

public  class Example23{

	public static int sunOfDigitInString(String str){
		int cnt=0;

		for(int i=0;i<str.length();i++){
			if(str.charAt(i)>='0' && str.charAt(i)<='9'){
				String s = new String(String.valueOf(str.charAt(i)));
				cnt+=Integer.parseInt(s);
			}
		}
		return cnt;

	}

	public static void main(String[] args) {
		

		String str = "welcome to 2024";

		int res= sunOfDigitInString(str);
		System.out.println("---> "+res);
	}
}