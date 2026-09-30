// Write a Java  program to check whether a string is palindrome or not.

public class Example01{

	public static String isPalindrome(String str){

		String res="";

		String newStr="";

		for(int i=str.length()-1;i>=0;i--){
			newStr=newStr+str.charAt(i);
		}

		if(newStr.equals(str)){
			res="Palindrome";

		}else{
			res="Not Palindrome";
		}

		return res;

	}
	public static void main(String[] args) {
		String str="ninin";

		System.out.println(isPalindrome(str));





	}
}